package 多线程;

public class ThreadStop extends Thread {
    @Override
    public void run() {
        System.out.println("线程开始执行---");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("这里抛出一个InterruptedException异常");
        }
        System.out.println("线程结束");
    }
}
