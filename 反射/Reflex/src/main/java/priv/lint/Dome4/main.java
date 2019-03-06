package priv.lint.Dome4;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 通过反射进行获取成员方法并使用
* 获取所有成员方法
* getMethods
* getDeclaredMethods
* 获取单个成员方法
* getMethod
* getDeclaredMethod
* 暴力访问
* method.setAccessible(true)
* */
public class main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        获取字节码文件对象
        Class<?> aClass = Class.forName("priv.lint.Dome.Student");


/*//        获取所有方法
//        Method[] methods = aClass.getMethods(); //获取自己，包括父亲的公共方法
        Method[] methods = aClass.getDeclaredMethods(); //获取自己的所有方法
        for (Method method : methods) {
            System.out.println(method);
        }*/

        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

/*//        获取单个方法

        *//*
        * Method getMethod(String name, 类<?>... parameterTypes)
返回一个 方法对象，它反映此表示的类或接口的指定公共成员方法 类对象。
        * *//*
//        第一个参数传的是一个方法名
//        第二个参数传的是参数的一个类型，比如String.class int.class
        Method show = aClass.getMethod("show");

        *//*
        * Object invoke(Object obj, Object... args)
        在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。
        * *//*
//        第一个参数是表示对象是谁
//        第二个参数是使用该方法的实际参数
//        返回值是使用Object类型，表示这个方法的返回值
        show.invoke(o);*/


        /*
        * 通过反射获取带参带返回值的方法
        * */
        Method show = aClass.getMethod("show", String.class);

        Object hello = show.invoke(o, "你好");
        System.out.println(hello);

        Method show1 = aClass.getMethod("show", int.class, String.class);
        show1.invoke(o,2,"hhh");

//        调用私有的方法
        Method shows = aClass.getDeclaredMethod("shows");
        shows.setAccessible(true);
        shows.invoke(o);
    }
}
