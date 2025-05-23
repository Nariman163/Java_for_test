package ru.stqa.qeometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.geometry.figures.Triangle;

public class TriangleTest {

    @Test
    void canCalAreaTriangle() {
        var s = new Triangle(3.0, 4.0, 5.0);
        double result = s.calculateArea();
        Assertions.assertEquals(6.0, result);
    }

    @Test
    void triangleExistSideA() {
        try {
            new Triangle(-3.0, 5.0, 6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exeption) {
        }
    }

    @Test
    void triangleExistSideB(){
        try {
            new Triangle(3.0, -5.0, 6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exeption) {
        }
    }

    @Test
    void triangleExistSideC(){
        try {
            new Triangle(3.0, 5.0, -6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exeption) {
        }
    }
}