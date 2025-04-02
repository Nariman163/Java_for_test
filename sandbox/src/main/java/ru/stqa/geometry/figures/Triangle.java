package ru.stqa.geometry.figures;
import java.lang.Math;





public class Triangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Периметр треугольника: " + triangle.calculatePerim());
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
    }
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculatePerim() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double semiPerimeter = calculatePerim() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

    }
}