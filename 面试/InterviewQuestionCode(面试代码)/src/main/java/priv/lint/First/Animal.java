package priv.lint.First;

public class Animal {
    static { System.out.println("Animal静态代码块"); }
    { System.out.println("Animal代码块"); }
    Animal(){ System.out.println("Animal构造函数"); }
}
