package com.azamat_komaev.javacore.chapter08;

class Box {
    double width;
    double height;
    double depth;

    // Create clone of the object
    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // create cube
    Box(double len) {
        width = height = depth = len;
    }

    double getVolume() {
        return width * height * depth;
    }
}

// extend Box class including weight attribute
class BoxWeight extends Box {
    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.076);

        double vol1, vol2;

        vol1 = box1.getVolume();
        vol2 = box2.getVolume();

        System.out.println("Volume of box1 is " + vol1);
        System.out.println("Weight of box1 is " + box1.weight);

        System.out.println("Volume of box2 is " + vol2);
        System.out.println("Weight of box2 is " + box2.weight);
    }
}
