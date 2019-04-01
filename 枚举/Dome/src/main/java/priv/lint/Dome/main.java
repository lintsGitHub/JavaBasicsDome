package priv.lint.Dome;

//简单实现一个枚举的原理
public class main {
    public static void main(String[] args) {
        Direction direction = Direction.TOP;
        System.out.println(direction);
        System.out.println("====================");

        Direction1 direction1 = Direction1.END;
        System.out.println(direction1.getName());

        System.out.println("=================");

        Direction2 direction2 = Direction2.RIGHT;
        System.out.println(direction2.getName());
        direction2.show();
    }
}
