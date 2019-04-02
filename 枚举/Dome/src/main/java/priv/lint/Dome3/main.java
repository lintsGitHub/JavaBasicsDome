package priv.lint.Dome3;

public class main {

    /*
    * 简单使用枚举类提供的一些方法
    * int compareTo(E o)
    将此枚举与指定的对象进行比较以进行订购。
    boolean equals(Object other)
    如果指定的对象等于此枚举常量，则返回true。
    protected void finalize()
    枚举类不能有finalize方法。
    类<E> getDeclaringClass()
    返回与此枚举常量的枚举类型相对应的Class对象。
    int hashCode()
    返回此枚举常量的哈希码。
    String name()
    返回此枚举常量的名称，与其枚举声明中声明的完全相同。
    int ordinal()
    返回此枚举常数的序数（其枚举声明中的位置，其中初始常数的序数为零）。
    String toString()
    返回声明中包含的此枚举常量的名称。
    static <T extends Enum<T>>
    T valueOf(类<T> enumType, String name)
    返回具有指定名称的指定枚举类型的枚举常量。
    * */

    //    简单使用我们常用的枚举类方法
    public static void main(String[] args) {
        Direction end = Direction.END;
        Direction top = Direction.TOP;

        System.out.println(end.compareTo(top));
        System.out.println(top.compareTo(end));
        System.out.println(end.compareTo(end));

        System.out.println(end.name());

        System.out.println(end.ordinal());

    }
}
