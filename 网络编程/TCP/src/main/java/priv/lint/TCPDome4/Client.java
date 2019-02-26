package priv.lint.TCPDome4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.Buffer;

public class Client {
    public static void main(String[] args) throws IOException {
//        建立客户端Socket对象
        Socket socket = new Socket("192.168.43.98", 6666);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        


    }
}
