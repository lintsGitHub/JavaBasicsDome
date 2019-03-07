package priv.lint.Dome6;

import priv.lint.Dome.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
* 在Java中读取配置文件的三种写法
* 1,基于ClassLoader读取配置文件
* 2,基于InputStream读取配置文件
* 3,通过java.util.ResourceBundle读取
* */
public class main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        Util util = new Util();
//        第一种方式
        InputStream one = util.one();
        properties.load(one);
        System.out.println(properties.getProperty("className"));
//        第二种方式
        BufferedReader tow = util.tow();
        properties.load(tow);
        System.out.println(properties.getProperty("className"));
//        第三种方式
        util.three();
    }
}
