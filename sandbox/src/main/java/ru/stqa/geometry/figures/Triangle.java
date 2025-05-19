package ru.stqa.geometry.figures;
import java.lang.Math;
import java.util.Objects;


public class Triangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(4, 5, 6);

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.sideA, triangle.sideA) == 0 && Double.compare(this.sideB, triangle.sideB) == 0 && Double.compare(this.sideC, triangle.sideC) == 0)
                || (Double.compare(triangle.sideA, this.sideA) == 0 && Double.compare(triangle.sideB, this.sideC) == 0 && Double.compare(triangle.sideC, this.sideB) == 0)
                || (Double.compare(triangle.sideA, this.sideA) == 0 && Double.compare(triangle.sideB, this.sideC) == 0 && Double.compare(triangle.sideC, this.sideB) == 0)
                || (Double.compare(triangle.sideA, this.sideA) == 0 && Double.compare(triangle.sideB, this.sideB) == 0 && Double.compare(triangle.sideB, this.sideC) == 0)
                || (Double.compare(triangle.sideA, this.sideC) == 0 && Double.compare(triangle.sideB, this.sideA) == 0 && Double.compare(triangle.sideC, this.sideB) == 0)
                || (Double.compare(triangle.sideA, this.sideB) == 0 && Double.compare(triangle.sideB, this.sideB) == 0 && Double.compare(triangle.sideC, this.sideC) == 0)
                || (Double.compare(triangle.sideC, this.sideA) == 0 && Double.compare(triangle.sideA, this.sideB) == 0 && Double.compare(triangle.sideB, this.sideC) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}