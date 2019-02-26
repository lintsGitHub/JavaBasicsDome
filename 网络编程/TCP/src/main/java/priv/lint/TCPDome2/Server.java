package priv.lint.TCPDome2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 服务器接收，并返回信息给客户端
* */
public class Server {
    public static void main(String[] args) throws IOException {
//        创建服务器Socket对象
        ServerSocket serverSocket = new ServerSocket(6666);
//        监听客户端连接
        Socket accept = serverSocket.accept(); //阻塞
//        获取输入流
        InputStream inputStream = accept.getInputStream();

        byte[] bytes = new byte[1024];

        int read = inputStream.read(bytes);

        String s = new String(bytes,0,read);
        System.out.println("server" + s);
//        作为回馈信息
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("数据接收完毕".getBytes());
//        释放资源
        accept.close();

    }
}
