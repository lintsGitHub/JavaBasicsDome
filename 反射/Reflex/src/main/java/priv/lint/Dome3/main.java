package priv.lint.Dome3;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
* 通过反射获取成员变量并赋值
* */
public class main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("priv.lint.Dome.Student");
        //获取public修饰的成员变量
        /*Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

//        获取所有的成员变量
        /*Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }*/

//        通过反射先获取一个对象
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();
//        获取单个的成员变量
//        获取Student的name并赋值
//A Field提供有关类或接口的单个字段的信息和动态访问。 反射的字段可以是类（静态）字段或实例字段。
        Field name = aClass.getDeclaredField("name");
        //还是要把那个Java访问检查给关掉
        name.setAccessible(true);
        /*
        * public void set(Object obj,
                Object value)
         throws IllegalArgumentException,
                IllegalAccessException将指定对象参数上的此Field对象表示的字段设置为指定的新值。 如果基础字段具有原始类型，则新值将自动展开
        * */
        name.set(o,"hello");  //给对象中的name赋值
        System.out.println(o);
    }
}
