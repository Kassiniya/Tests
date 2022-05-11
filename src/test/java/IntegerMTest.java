import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;
import org.junit.jupiter.api.*;
public class IntegerMTest {
    @Order(1)
    @Test
    public void testIntegerMultipleOf3And5() {
        int a = 15;
        String expectedResult = "Good Number";

        IntegerM as = new IntegerM();
        String actualResult = as.IntegerM(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testIntegerMultipleOf3AndNotOf5() {
        int a = 3;
        String expectedResult = "Bad Number";

        IntegerM as = new IntegerM();
        String actualResult = as.IntegerM(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testIntegerMultipleOf5AndNotOf3() {
        int a = 5;
        String expectedResult = "Poor Number";

        IntegerM as = new IntegerM();
        String actualResult = as.IntegerM(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void testIntegerMNotSatisfy() {
        int a = 1;
        String expectedResult = "-1";

        IntegerM as = new IntegerM();
        String actualResult = as.IntegerM(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}