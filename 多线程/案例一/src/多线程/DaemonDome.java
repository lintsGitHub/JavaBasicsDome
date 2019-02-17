package 多线程;

public class DaemonDome {
    public static void main(String[] args) {
        ThreadDaemon t1 = new ThreadDaemon();
        ThreadDaemon t2 = new ThreadDaemon();
        ThreadDaemon t3 = new ThreadDaemon();
        t1.setName("HELLO");
        t2.setName("WORD");
        t3.setName("SET");
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
