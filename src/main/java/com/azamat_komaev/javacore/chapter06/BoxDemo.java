package com.azamat_komaev.javacore.chapter06;

/*
    The program is using class Box
*/
class Box {
    double width;
    double height;
    double depth;

    Box () {
        System.out.println("Construct object Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // return box volume
    double getVolume() {
        return width * height * depth;
    }
}

// In this class init Box object
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol1, vol2;

        vol1 = mybox1.getVolume();
        vol2 = mybox2.getVolume();
        System.out.println("Volume of the first box is " + vol1);
        System.out.println("Volume of the second box is " + vol2);
    }
}
