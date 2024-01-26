package org.example.module1.lesson26;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example1 {

    public static final int DEFAULT_BUFFER_SIZE = 128;

    public static void main(String[] args) {
        String filename = "src/main/resources/module1.lesson26/data.txt";
        try (RandomAccessFile file = new RandomAccessFile(filename, "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(DEFAULT_BUFFER_SIZE);
            int numberOfBytes;
            while ((numberOfBytes = channel.read(buffer)) != -1) {
                buffer.flip();
                System.out.print(new String(buffer.array(),0, numberOfBytes));
                buffer.clear();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
