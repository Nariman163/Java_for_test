package ru.stqa.geometry.figures;

public record Square(double side) {

    public Square {
        if (side < 0) {
            throw new IllegalArgumentException("Bla bla");
        }
    }

    public static void printSquareArea(Square s) {
        System.out.println("Площадь квадрата со стороной " + s.side + " = " + s.area());
    }

    public double area() {
        return this.side * this.side;
    }
}

