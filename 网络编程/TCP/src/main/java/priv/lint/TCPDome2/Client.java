package priv.lint.TCPDome2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
//        创建客户端Socket对象
        Socket socket = new Socket("192.168.43.98", 6666);

//        获取输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好吗？".getBytes());

//        获取输入流
        InputStream inputStream = socket.getInputStream();
        byte[] bytes =new byte[1024];
        int read = inputStream.read(bytes);

        String s = new String(bytes, 0, read);
        System.out.println(s);

//        释放资源
        socket.close();

    }
}
