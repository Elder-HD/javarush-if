package org.example.module1.lesson25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example1 {


    // Task1*: reimplement current code using buffer: read( byte[] buffer) and write(byte[] buffer) ???
    public static void main(String[] args) {
        FileByteReaderWriter fileReaderWriter = new FileByteReaderWriter();

        fileReaderWriter.copyFromFileToFile("src/main/resources/module1/lesson25/example1.txt",
                "src/main/resources/module1/lesson25/destination1.txt");
    }


}

interface FileReaderWriter {
    void copyFromFileToFile(String sourceFilename, String targetFilename);

}

class FileByteReaderWriter implements FileReaderWriter {
    private static final int DEFAULT_BUFFER_CAPACITY = 32;

    private final int bufferCapacity;

    public FileByteReaderWriter() {
        this.bufferCapacity = DEFAULT_BUFFER_CAPACITY;
    }

    // 1) bufferCapacity < 0 throw exception
    // 2) bufferCapacity<DEFAULT_BUFFER_CAPACITY,  -> this.bufferCapacity = DEFAULT_BUFFER_CAPACITY;

    public FileByteReaderWriter(int bufferCapacity) {
        if (bufferCapacity < 0) {
            throw new IllegalArgumentException("Buffer capacity should be positive value, current value: " + bufferCapacity);
        }
        this.bufferCapacity = Math.max(bufferCapacity, DEFAULT_BUFFER_CAPACITY);
    }

    @Override
    public void copyFromFileToFile(String sourceFilename, String targetFilename) {
        File sourceFile = new File(sourceFilename);
        File targetFile = new File(targetFilename);
        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(targetFile)) {
            int numberOfBytes;
            byte[] buffer = new byte[bufferCapacity];
            while ((numberOfBytes = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, numberOfBytes);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//TODO: should be implemented
class FileCharReaderWrite implements FileReaderWriter {

    // use for implementation
    // java.io.Reader;
    // java.io.Writer;
    @Override
    public void copyFromFileToFile(String sourceFilename, String targetFilename) {
        throw new UnsupportedOperationException("Should be implemented");
    }
}
