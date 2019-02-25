package priv.lint.ChatDome;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
* Exception in thread "main" java.lang.IllegalArgumentException: port out of range:100022
* 这个是有一个非法参数
* 这里就出现了端口号的一个错误，因为端口号是在0~65535之间的
* Exception in thread "main" java.net.BindException: Address already in use: Cannot bind
* 当我们多次启动接收端，就会存在一个端口被占用的问题
*
* */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
//        创建接收端的一个Socket对象
        DatagramSocket socket = new DatagramSocket(10022);
//        创建一个数据容器(数据包裹)
        while(true) {
            byte[] bytes = new byte[1024];
            int length = bytes.length;
            DatagramPacket packet = new DatagramPacket(bytes, length);

//        接收数据
            socket.receive(packet);
//        数据可视化
            byte[] data = packet.getData();
            int length1 = data.length;
            String res = new String(data, 0, length1);
            String hostAddress = packet.getAddress().getHostAddress();
            System.out.println(hostAddress + ">>>" + res);
        }
//        释放资源
//        socket.close();
    }
}
