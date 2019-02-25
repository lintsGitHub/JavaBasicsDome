package priv.lint.TCPDome;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP协议接收数据：
 * 1，创建接收端的Socket对象
 * 2，监听客户端连接，返回一个对应的Socket对象
 * 3，获取输入流，呈现数据
 * 4，释放资源
 * */
public class Server {

    public static void main(String[] args) throws IOException {
//        创建接收端的Socket对象
//        ServerSocket(int port)
//        创建绑定到指定端口的服务器套接字。
        ServerSocket serverSocket = new ServerSocket(6666);

//        监听客户端连接，返回一个对应的Socket对象
//        accept()
//        侦听要连接到此套接字并接受它。
//        侦听并接收到套接字的连接，此方法在连接传入前一直阻塞
        Socket accept = serverSocket.accept();

//        获取输入流，呈现数据
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        String hostAddress = serverSocket.getInetAddress().getHostAddress();
        System.out.println(hostAddress + "::" + new String(bytes,0,read));

//        释放资源
        accept.close();
//        服务器不应该关闭
//        serverSocket.close();
    }
}
