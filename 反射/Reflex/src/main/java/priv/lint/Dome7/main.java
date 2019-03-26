package priv.lint.Dome7;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
* 一个ArrayList<Integer>对象,想添加一个字符串如何实现
*
* 可以使用反射进行解决，通过看源码，ArrayList对象的一个add方法的一个参数是一个Object对象
* 我们可以使用反射进行越过泛型的检查
* */
public class main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList();

        Class<? extends ArrayList> aClass = list.getClass(); //集合ArrayList的Class文件对象

        Method add = aClass.getMethod("add", Object.class);

        add.invoke(list,"hello");
        add.invoke(list,"hello");
        add.invoke(list,"hello");

        System.out.println(list);
    }
}
