package com.azamat_komaev.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        String filePath = "/home/azamat/programming/java/java_mentoring/src/main/java/com/azamat_komaev/javacore/chapter21/write_data.txt";

        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(filePath),
                                                                          StandardOpenOption.WRITE,
                                                                          StandardOpenOption.READ,
                                                                          StandardOpenOption.CREATE)) {
            MappedByteBuffer buffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i=0; i<26; i++) {
                buffer.put((byte) ('A' + i));
            }
            buffer.rewind();

            byte[] fileBytes = new byte[(int) fileChannel.size()];
            buffer.get(fileBytes);
            System.out.println(new String(fileBytes));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
