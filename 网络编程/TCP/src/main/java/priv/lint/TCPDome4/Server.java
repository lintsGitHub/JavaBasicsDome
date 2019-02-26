package priv.lint.TCPDome4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/*
* 键盘录入
* 输出文本文件
* */
public class Server {
    public static void main(String[] args) throws IOException {
//        建立服务端Socket连接对象
        ServerSocket serverSocket = new ServerSocket(6666);

//        监听客户端连接、
        Socket accept = serverSocket.accept();

//        封装通道数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));

//        封装文本文件

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"));
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

//        释放资源
//        bufferedReader.close();
        bufferedWriter.close();
        accept.close();
//        serverSocket.close();

    }
}
