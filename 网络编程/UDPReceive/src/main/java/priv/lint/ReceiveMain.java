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
/*
* public void receive(DatagramPacket p)
             throws IOException
* 注意：在这个从此套接字接收数据报包。 当此方法返回时， DatagramPacket的缓冲区将填充接收到的数据。 数据包数据包还包含发送者的IP地址和发件人机器上的端口号。
    该方法阻塞，直到接收到数据报。 数据报包对象的length字段包含接收到的消息的长度。 如果消息长于数据包的长度，消息将被截断。
    如果有安全管理员，如果安全管理员的checkAccept方法不允许，则无法接收到数据包。

* */

public class ReceiveMain {
    public static void main(String[] args) throws IOException {
//        创建接收端的Socket对象
//        DatagramSocket(int port)
        DatagramSocket datagramSocket = new DatagramSocket(10087);
//        创建数据包
        byte[] bytes = new byte[1024];
        int length = bytes.length;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, length);
//        调用Socket对象的接收方法进行接收数据
        datagramSocket.receive(datagramPacket);
//        解析数据，数据可视化
        byte[] data = datagramPacket.getData(); //获取数据缓冲区
        int length1 = data.length; //获取数据实际长度
        String s = new String(data, 0, length1);
//        获取对方的IP
        InetAddress address = datagramPacket.getAddress();
        String hostName = address.getHostName();
        System.out.println(hostName + ":" + s);
//        释放资源
        datagramSocket.close();
    }
}
