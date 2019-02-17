package priv.lint;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/*
* UDP协议接收数据
* 1,创建接收端的Socket对象
* 2,创建一个数据包(接收容器)
* 3,调用Socket对象的接收方法进行接收数据
* 4,解析数据，数据可视化(控制台)
* 5,释放资源
* */
public class ReceiveMain {
    public static void main(String[] args) throws IOException {
//        创建接收端的Socket对象
//        DatagramSocket(int port)
        DatagramSocket datagramSocket = new DatagramSocket(10087);
//        创建数据包
        byte[] bytes = new byte[1024];
        int length = bytes.length;
        DatagramPacket datagramPacket = new DatagramPacket(bytes,length);
//        调用Socket对象的接收方法进行接收数据
        datagramSocket.receive(datagramPacket);
//        解析数据，数据可视化
        byte[] data = datagramPacket.getData(); //获取数据缓冲区
        int length1 = data.length; //获取数据实际长度
        String s = new String(data,0,length1);
//        获取对方的IP
        InetAddress address = datagramPacket.getAddress();
        String hostName = address.getHostName();
        System.out.println(hostName+":"+s);
//        释放资源
        datagramSocket.close();
    }
}
