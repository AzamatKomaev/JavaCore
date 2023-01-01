package com.azamat_komaev.javacore.chapter20.serialization;

import java.io.*;

public class SerializationDemo {
    private final static String filePath = "/home/azamat/programming/java/java_mentoring/src/main/java/com/azamat_komaev/javacore/chapter20/serialization/serial.class";

    static void serializeObject() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            User userToSerialize = new User("Azamat", "Komaev", 16, 62.3);
            System.out.println("Serialize: " + userToSerialize);
            outputStream.writeObject(userToSerialize);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void deserializeObject() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            User userToDeserialize = (User) inputStream.readObject();
            System.out.println("Deserialize: " + userToDeserialize);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        serializeObject();
        deserializeObject();
    }
}
