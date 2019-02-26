package priv.lint.TCPDome4;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
//        建立客户端Socket对象
        Socket socket = new Socket("192.168.43.98", 6666);



    }
}
