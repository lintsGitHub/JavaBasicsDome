package priv.lint.Dome6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class Util {
    public InputStream one(){
//        1,基于ClassLoader读取配置文件
//        System.out.println(Util.class.getClassLoader());
        InputStream resource = Util.class.getClassLoader().getResourceAsStream("class.properties");
        return resource;
    }

    public BufferedReader tow() throws FileNotFoundException {
//        基于InputStream读取配置文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:/SSM/Java基础/反射/Reflex/src/main/resources/class.properties"));
        return bufferedReader;
    }

    public  void three(){
//        通过java.util.ResourceBundle读取
        ResourceBundle bundle = ResourceBundle.getBundle("class");
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()){
            String s = keys.nextElement();
            Object object = bundle.getObject(s);
            System.out.println(s);
            System.out.println(object);
        }
    }

}
