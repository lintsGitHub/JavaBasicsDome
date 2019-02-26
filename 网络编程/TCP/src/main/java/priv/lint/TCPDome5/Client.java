package priv.lint.TCPDome5;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
//        创建客户端Socket对象
        Socket socket = new Socket("192.168.43.98", 6666);

//        封装文本文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));

//        封装管道流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
//        释放资源
        bufferedReader.close();
        socket.close();
    }
}
