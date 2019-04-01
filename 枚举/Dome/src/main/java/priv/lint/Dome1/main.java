package priv.lint.Dome1;

public class main {
    public static void main(String[] args) {
        Direction top = Direction.TOP;
        System.out.println(top);
        System.out.println("==============");

        Direction1 end = Direction1.END;
        System.out.println(end.getName());
        System.out.println(end);
        System.out.println("==========");

        Direction2 top1 = Direction2.TOP;
        top1.show();
        System.out.println(top1.getName());

    }

}
