package com.azamat_komaev.javacore.chapter21;

import java.nio.ByteBuffer;

import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        String folderPath = "/home/azamat/programming/java/java_mentoring/src/main/java/com/azamat_komaev/javacore/chapter21/";
        Path pathToFile = Paths.get(folderPath, "data.txt");

        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(pathToFile)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) fileChannel.size());
            fileChannel.read(buffer);
            buffer.flip();

            byte[] bytes = new byte[buffer.remaining()];
            buffer.get(bytes);
            String result = new String(bytes);
            System.out.println(result);

        } catch (NoSuchFileException e) {
            System.out.println("No such file!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
