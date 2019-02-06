package priv.lint;

import java.io.IOException;
import java.net.*;

/**
 * UDP协议发送数据：
 * 1,创建发送端的Socket对象
 * 2,创建对象，并将数据打包
 * 3,调用Socket对象发送方法发送数据
 * 4,释放资源
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//         1,创建发送端的Socket对象
        DatagramSocket socket = new DatagramSocket();
//         2,创建对象，并将数据打包
//        创建数据
        byte[] by = "HELLO,你好啊".getBytes();
//        长度
        int length = by.length;
//        IP地址对象
        InetAddress address = InetAddress.getByName("192.168.191.1");
//        端口
        int port = 10087;
//        数据打包
        DatagramPacket packet = new DatagramPacket(by,length,address,port);
//         3,调用Socket对象发送方法发送数据
        socket.send(packet);
//         4,释放资源
        socket.close();
    }
}
