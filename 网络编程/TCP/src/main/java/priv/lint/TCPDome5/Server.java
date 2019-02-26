package priv.lint.TCPDome5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
//        建立服务端Socket对象
        ServerSocket serverSocket = new ServerSocket(6666);

//        监听客户端连接
        Socket accept = serverSocket.accept();

//        封装通道中流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        accept.close();
    }
}
