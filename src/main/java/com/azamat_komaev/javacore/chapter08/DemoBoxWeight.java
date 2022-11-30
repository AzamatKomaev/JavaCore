package com.azamat_komaev.javacore.chapter08;

class Box {
    private double width;
    private double height;
    private double depth;

    // Create clone of the object
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
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

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight box3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mycube);
        double vol;

        vol = box1.getVolume();
        System.out.println("Volume of box1 is " + vol);
        System.out.println("Weight of box1 is " + box1.weight);
        System.out.println();

        vol = box2.getVolume();
        System.out.println("Volume of box2 is " + vol);
        System.out.println("Weight of box2 is " + box2.weight);
        System.out.println();

        vol = box3.getVolume();
        System.out.println("Volume of box3 is " + vol);
        System.out.println("Weight of box3 is " + box3.weight);
        System.out.println();

        vol = mycube.getVolume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();

        vol = myclone.getVolume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
    }
}
