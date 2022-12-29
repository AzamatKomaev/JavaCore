package com.azamat_komaev.javacore.chapter20.serialization;

import java.io.Serializable;

public class User implements Serializable {
    String firstName;
    String lastName;
    Integer age;
    Double weight;

    public User(String firstName, String lastName, Integer age, Double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "User{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", weight=" + weight +
            '}';
    }
}
