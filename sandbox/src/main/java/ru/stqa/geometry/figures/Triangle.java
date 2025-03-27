package ru.stqa.geometry.figures;

public class Triangle {
    public static void printPerimetr(double length1, double length2, double length3){
        String answer = String.format("Периметр треугольника со сторонами %f, %f, %f = %f", length1, length2, length3, perimetrArea(length1, length2,length3));
        System.out.println(answer);
}
    private static double perimetrArea(double a, double b, double c){
return a+b+c;
}
}
