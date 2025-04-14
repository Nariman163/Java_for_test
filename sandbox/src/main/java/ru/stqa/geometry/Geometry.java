package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square; //Путь к пакету, где находится класс
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args){
        Square.printSquareArea(new Square(7));     //Вызов функции
        Square.printSquareArea(new Square(3));
        Square.printSquareArea(new Square(5));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

    }

}
