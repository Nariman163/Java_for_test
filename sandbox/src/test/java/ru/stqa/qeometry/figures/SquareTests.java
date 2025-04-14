package ru.stqa.qeometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.geometry.figures.Square;

public class SquareTests {

  //  @Test
    //void canCalculateArea(){
   //     var s = new Square(5);
    //    double result = s.area();
   //      Assertions.assertEquals(25.0, result);
//
   //  }
    @Test
    void cannotCreateSquareWithNegativeSide(){
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }
    }
}
