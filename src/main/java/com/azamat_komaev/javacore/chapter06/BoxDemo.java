package com.azamat_komaev.javacore.chapter06;

/*
    The program is using class Box
*/
class Box {
    double width;
    double height;
    double depth;
}

// In this class init Box object
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume of the box is " + vol);
    }
}
