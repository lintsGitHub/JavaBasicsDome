package priv.lint.Dome1;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
* 通过反射获取构造方法并使用
* */
public class main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        获取字节码文件对象
        Class aClass = Class.forName("priv.lint.Dome.Student");
        /*
        * Constructor<?>[] getConstructors()
返回包含一个数组 Constructor对象反射由此表示的类的所有公共构造 类对象
Constructor提供了一个类的单个构造函数的信息和访问。
        * */
//        拿到了所有的constructor的信息,但是这个构造函数必须是使用public来进行修饰的

        /*Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }*/

//        如果我们一定要拿到所有构造函数呢，Java也提供了这样的方法
        /*Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }*/

//        如果我们要获取众多构造函数中一个呢
//        获取无参构造器
/*        Constructor constructor = aClass.getConstructor(); //返回构造方法对象
        System.out.println(constructor); //public priv.lint.Dome.Student()
        *//*
        * 使用由此Constructor对象表示的构造函数，使用指定的初始化参数创建和初始化构造函数的声明类的新实例。 个别参数自动解包以匹配原始形式参数，原始参考参数和参考参数都需要进行方法调用转换
        * *//*
        Object o = constructor.newInstance();
        System.out.println(o); //Student{id=0, name='null', age=0}*/

//        获取带参构造器
        Constructor constructor = aClass.getConstructor(int.class,String.class,int.class);
        System.out.println(constructor); //获取带参构造方法对象
//        newInstance可以传参数，参数就是构造方法对象的参数，也就是创建出来的对象的一个默认参数
        Object hello = constructor.newInstance(1, "hello", 34);
        System.out.println(hello);


    }
}
