package ru.stqa.qeometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.geometry.figures.Square;

public class SquareTests {

    @Test
    void canCalculateArea(){
        double result = Square.squareArea(5);
        Assertions.assertEquals(25.0, result);
    }
}
