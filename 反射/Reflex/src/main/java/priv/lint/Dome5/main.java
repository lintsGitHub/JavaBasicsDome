package priv.lint.Dome5;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 通过配置文件运行类中的一个show方法
*
* 我们可以使用一个文本文件替代properties文件
* 键值关系，一个类名，一个方法名
*
* */
public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        没有反射前，我们都是使用硬编码
//        就是那种实例对象调用方法
//        Student student = new Student();
//        student.show();

//        使用反射后的一个做法
        Properties properties = new Properties();
//        加载键值对数据源，也就是class.txt文件
//        FileReader reader = new FileReader("E:/SSM/Java基础/反射/Reflex/src/main/resources/class.txt");
//        加载键值对数据源，也就是class.properties文件
        BufferedReader reader = new BufferedReader(new FileReader("E:/SSM/Java基础/反射/Reflex/src/main/resources/class.properties"));
        properties.load(reader);
        reader.close();
//        获取数据
        String className = (String) properties.get("className");
        String  methodName = (String) properties.get("methodName");

//        通过反射使用数据进行动态的创建对象，并使用方法
//        创建对象
        Class<?> aClass = Class.forName(className);
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();
//        使用方法
        Method method = aClass.getMethod(methodName);
        method.invoke(o);

    }
}
