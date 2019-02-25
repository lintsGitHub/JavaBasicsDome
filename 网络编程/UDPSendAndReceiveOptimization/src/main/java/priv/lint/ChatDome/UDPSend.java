package priv.lint.ChatDome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*键盘录入数据，并发送*/

public class UDPSend {
    public static void main(String[] args) throws IOException {
////        创建发送端Socket对象
//        DatagramSocket datagramSocket = new DatagramSocket();
////        创建要发送的数据
//        byte[] bytes = "hello".getBytes();
//        int length = bytes.length;
////        配置要发送的IP
//        InetAddress inetAddress = InetAddress.getByName("192.168.43.98");
////        端口
//        int post = 10022;
////        将数据打包
//        DatagramPacket packet = new DatagramPacket(bytes, length, inetAddress, post);
////        发送数据
//        datagramSocket.send(packet);
////        释放资源
//        datagramSocket.close();
/*//        录入控制台数据的第一种方式
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());*/

/*//        第二种方式
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader.readLine());*/

        DatagramSocket datagramSocket = new DatagramSocket();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
//        创建要发送的数据
        byte[] bytes = line.getBytes();
        int length = bytes.length;
//        配置要发送的IP
        InetAddress inetAddress = InetAddress.getByName("192.168.43.98");
//        端口
        int post = 10022;
//        将数据打包
        DatagramPacket packet = new DatagramPacket(bytes, length, inetAddress, post);
//        发送数据
        datagramSocket.send(packet);
        }
        datagramSocket.close();
    }

}
