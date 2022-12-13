package com.azamat_komaev.javacore.chapter08;

// Use polymorphism

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double getArea();
}

class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double getArea() {
        System.out.println("Area of rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double getArea() {
        System.out.println("Area of triangle");
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        // Figure figure = new Figure(10, 10); // cant be runned!
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figref; // object is not creating
        
        figref = rectangle;
        System.out.println("Area is " + figref.getArea());

        figref = triangle;
        System.out.println("Area is " + figref.getArea());
    }
}
