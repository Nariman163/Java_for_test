package ru.stqa.geometry.figures;
import java.lang.Math;





public class Triangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(1, 5, 6);

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
        if (sideA*sideB*sideC<0){
            throw new IllegalArgumentException("Треугольник с отрицательной стороной");
        }
        if  ((sideA >= sideB + sideC) || (sideB >= sideA + sideC) || (sideC >= sideA + sideB)){
            throw new IllegalArgumentException("Треугольник с некорректной стороной");
        }

    }


    public double calculatePerim() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double semiPerimeter = calculatePerim() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

    }
}