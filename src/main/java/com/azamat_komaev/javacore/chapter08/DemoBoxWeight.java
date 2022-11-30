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

// add cost attribute
class Shipment extends BoxWeight {
    public double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double width, double height, double depth,
             double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol1, vol2;

        vol1 = shipment1.getVolume();
        vol2 = shipment2.getVolume();

        System.out.println("Volume of shipment1 is " + vol1);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Cost of shipment: $" + shipment1.cost);
        System.out.println();
        System.out.println("Volume of shipment2 is " + vol2);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Cost of shipment: $" + shipment2.cost);
    }
}
