package 多线程;

public class StopDome {
    public static void main(String[] args) {
        ThreadStop t1 = new ThreadStop();
        t1.start();
        try {
            Thread.sleep(1000);
            //t1.stop();  //代码一秒后中断，中断后不会执行后面的代码了，这样会给我们带来很大的麻烦
//            stop :输出    线程开始执行---
            t1.interrupt();//代码在一秒钟后抛出一个异常
            /*interrupt : 输出 线程开始执行---
                            这里抛出一个InterruptedException异常
                            线程结束*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
