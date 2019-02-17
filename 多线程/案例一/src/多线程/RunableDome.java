package 多线程;

/*
*   使用Runnable接口
*       步骤：
*           1.自定义类MyRunnable实现Runnable接口
*           2.重写run()方法
*           3.创建MyRunnable类对象
*           4.创建Thread对象，并将MyRunnable对象作为参数传递
*
* */
public class RunableDome {
    public static void main(String[] args) {
        //创建MyRunable对象
        MyRunable my = new MyRunable();

        //API 中讲述了一个Thread 的代参构造函数
        //Thread(Runnable runnble);
        //Thread t1 = new Thread(my);
        //Thread t2 = new Thread(my);
       //Thread(Runnable runnable , String ThreadName)
        Thread t1 = new Thread(my,"HELLO");
        Thread t2 = new Thread(my,"WORD");
        t1.start();
        t2.start();
    }
}
