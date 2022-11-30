package com.azamat_komaev.javacore.chapter08;

// Use polymorphism

import W.W.R;

class Figure {
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double getArea() {
        System.out.println("Area of the figure is unknown");
        return 0;
    }
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
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figref;
        
        figref = rectangle;
        System.out.println("Area is " + figref.getArea());

        figref = triangle;
        System.out.println("Area is " + figref.getArea());

        figref = figure;
        System.out.println("Area is " + figref.getArea());
    }
}
