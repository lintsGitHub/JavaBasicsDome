package priv.lint.LockDome;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static void main(String[] args) {
        final main main = new main();
        new Thread("A") {
            @Override
            public void run() {
                main.insert(Thread.currentThread());
            }
        }.start();
        new Thread("B") {
            @Override
            public void run() {
                main.insert(Thread.currentThread());
            }
        }.start();
    }

    public void insert(Thread thread) {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println(thread.getName() + "获取到锁");
        } catch (Exception e) {

        } finally {
            System.out.println(thread.getName() + "释放了锁");
            lock.unlock();
        }
    }
    /*
    * 输出结果
    *A获取到锁
    A释放了锁
    B获取到锁
    B释放了锁
    * */
}
