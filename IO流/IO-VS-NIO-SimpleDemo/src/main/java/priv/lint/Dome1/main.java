package priv.lint.Dome1;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class main {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        IODome();
        long millis1 = System.currentTimeMillis();
        System.out.println("");
        System.out.println(millis1 - millis);
        long millis2 = System.currentTimeMillis();
        NIODemo();
        long millis3 = System.currentTimeMillis();
        System.out.println("");
        System.out.println(millis3 - millis2);
    }
    //    我们简单的使用IO流去读一个文件中的数据
    private static void IODome() {
        InputStream inputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream("src/text.txt"));
            byte[] bytes = new byte[2048];
            int br = inputStream.read(bytes);
            while (br != -1) {
                for (int i = 0; i < br; i++)
                    System.out.print((char) bytes[i]);
                br = inputStream.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert inputStream != null;
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 我们已经对IO流有一定的了解，但是NIO又是什么呢？
     * 基于NIO的一些框架：Netty
     *
     * */
    private static void NIODemo() {
//        这个类（RandomAccessFile）的API值得一看
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("src/text.txt", "rw");
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer allocate = ByteBuffer.allocate(2048);
            int read = channel.read(allocate);
            while (read != -1) {
                allocate.flip();
                while (allocate.hasRemaining()) {
                    System.out.print((char) allocate.get());
                }

                allocate.compact();
                read = channel.read(allocate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert randomAccessFile != null;
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
