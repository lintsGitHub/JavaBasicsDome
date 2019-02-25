package priv.lint.DOSChat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
    public static void main(String[] args) throws IOException {
//        创建发送端Socket对象
        DatagramSocket datagramSocket = new DatagramSocket();
//        创建要发送的数据
        byte[] bytes = "hello".getBytes();
        int length = bytes.length;
//        配置要发送的IP
        InetAddress inetAddress = InetAddress.getByName("192.168.43.98");
//        端口
        int post = 10022;
//        将数据打包
        DatagramPacket packet = new DatagramPacket(bytes,length,inetAddress,post);
//        发送数据
        datagramSocket.send(packet);
//        释放资源
        datagramSocket.close();
    }

}
