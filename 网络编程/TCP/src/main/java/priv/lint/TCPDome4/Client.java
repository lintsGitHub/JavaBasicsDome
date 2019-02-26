package priv.lint.TCPDome4;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

public class Client {
    public static void main(String[] args) throws IOException {
//        建立客户端Socket对象
        Socket socket = new Socket("192.168.43.98", 6666);

//        封装键盘录入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        封装通道数据
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            if ("2".equals(line)){
                break;
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

//        释放资源
//        bufferedReader.close();
//        bufferedWriter.close();
        socket.close();

    }
}
