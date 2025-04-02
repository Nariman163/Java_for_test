package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side){
        System.out.println("Площадь квадрата со стороной " + side + " = " + squareArea(side));

    }

    public static double squareArea(double a) {
        return a * a;
    }
}
