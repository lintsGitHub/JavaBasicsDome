package 多线程;

public class MainClass {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("HELLO");
        thread.start();
    }

}
