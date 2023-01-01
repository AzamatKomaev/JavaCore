package com.azamat_komaev.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        String folderPath = "/home/azamat/programming/java/java_mentoring/src/main/java/com/azamat_komaev/javacore/chapter21/";
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(folderPath, "data.txt"))) {
            long fileSize = fileChannel.size();
            MappedByteBuffer byteBuffer = fileChannel.map(
                FileChannel.MapMode.READ_ONLY, 0, fileSize
            );

            byte[] bytes = new byte[byteBuffer.remaining()];
            byteBuffer.get(bytes);
            String result = new String(bytes);
            System.out.println(result);
        } catch (InvalidPathException e) {
            System.out.println("File path exception");
        }
        catch (IOException e) {
            System.out.println("Input-output exception");
        }
    }
}
