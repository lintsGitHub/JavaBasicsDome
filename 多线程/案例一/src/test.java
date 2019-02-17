public class test {
    public static void main(String[] args) {
        int a = 10;
        Thread t = new Thread(() -> {
            System.out.println(a);
            System.out.println("hello");
        });
        t.start();

        System.out.println("hello");
    }
    public void  sh(String a){
        int b =0;
        StringBuffer sb = null;
        new Thread(() -> {
            System.out.println(sb);
            System.out.println(b);
        }).start();
    }
}
