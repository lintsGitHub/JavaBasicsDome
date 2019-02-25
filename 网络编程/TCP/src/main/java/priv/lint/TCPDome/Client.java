package priv.lint.TCPDome;

/*
* TCP协议发送数据步骤：
* 1，创建发送端的Socket对象 （如果成功，表示连接已经成功）
* 2，获取输出流，渲染数据
* 3，关闭流
*
* 连接被拒绝，TCP协议一定要先开服务器
* Exception in thread "main" java.net.ConnectException: Connection refused: connect
*
* */

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
//    创建发送端的Socket对象
//Socket(InetAddress address, int port)
//    创建流套接字并将其连接到指定IP地址的指定端口号。
//    Socket socket = new Socket(InetAddress.getByName("192.168.43.98"),6666);
//    Socket(String host, int port)
//    创建流套接字并将其连接到指定主机上的指定端口号。
        Socket socket = new Socket("192.168.43.98", 6666);

//        获取输出流
//        getOutputStream()
//        返回此套接字的输出流。
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("TCP".getBytes());
//        释放资源

        socket.close();
    }
}
