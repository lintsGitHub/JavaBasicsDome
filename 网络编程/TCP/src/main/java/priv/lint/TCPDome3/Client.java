package priv.lint.TCPDome3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
//        创建客户端Socket
        Socket socket = new Socket("192.168.43.98", 6666);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String s = null;

        while ((s =bufferedReader.readLine()) != null) {
            if ("1".equals(s)){
                break;
            }
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
//        释放资源
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
