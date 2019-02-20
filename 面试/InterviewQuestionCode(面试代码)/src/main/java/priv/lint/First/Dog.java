package priv.lint.First;

public class Dog extends Animal {
    static { System.out.println("Dog静态代码块"); }
    { System.out.println("Dog代码块"); }
    Dog(){ System.out.println("Dog构造函数"); }
}
