package com.azamat_komaev.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        String filePath = "/home/azamat/programming/java/java_mentoring/src/main/java/com/azamat_komaev/javacore/chapter21/write_data.txt";

        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(filePath),
                                                                          StandardOpenOption.WRITE,
                                                                          StandardOpenOption.CREATE)) {
            String name = "Azamat";
            ByteBuffer buffer = ByteBuffer.allocate(name.length());
            buffer.put(name.getBytes());
            buffer.rewind();
            fileChannel.write(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
