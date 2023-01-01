package com.azamat_komaev.javacore.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) {
        Path folderPath = Paths.get("/home/azamat");

        try (
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(folderPath, Files::isRegularFile))
        {
            for (Path path : directoryStream) {
                System.out.println(path);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
