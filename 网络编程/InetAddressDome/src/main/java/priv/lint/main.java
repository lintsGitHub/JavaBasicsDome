package priv.lint;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Vector;

/*
* 如果一个类没有构造方法：
* 1，成员变量都是静态的（Math,Array,Collections,String）
* 2，单例模式（Runtime）
* 3，类中有静态方法返回这个类的对象（InetAddress）
* */

public class main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();

        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
//        System.out.println(Inet4Address.getLocalHost());
//        InetAddress byName = InetAddress.getByName("192.168.34.76");
//        System.out.println(byName.getHostName());
//        System.out.println(byName.getHostAddress());
    }
}
