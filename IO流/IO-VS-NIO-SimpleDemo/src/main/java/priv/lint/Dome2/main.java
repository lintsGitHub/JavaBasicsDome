package priv.lint.Dome2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class main {
    public static void main(String[] args) {
        try {
            MappedByteBufferTest();
            ByteBufferTest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void MappedByteBufferTest() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/jdkapi.CHM", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        long t1 = System.currentTimeMillis();
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY,0,randomAccessFile.length());
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        randomAccessFile.close();
        channel.close();
    }
    private static void ByteBufferTest() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/jdkapi.CHM", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        long t1 = System.currentTimeMillis();
        ByteBuffer allocate = ByteBuffer.allocate((int) randomAccessFile.length());
        allocate.clear();
        int read = channel.read(allocate);
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        channel.close();
        randomAccessFile.close();
    }
}
