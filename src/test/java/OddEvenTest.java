import org.w3c.dom.ls.LSOutput;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// Test Data:
//-345 →  “Odd”
//0 →  “Even”
//222222 →  “Even”
//2147483647 + 1 →  “Undefined”

public class OddEvenTest {
    @Order(1)
    @Test
    public void testOddEvenHappyPathPositiveOddNumber() {
        long number = 1;
        String expectedResult = "Odd";

        OddEven as = new OddEven();
        String actualResult = as.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathNegativeOddNumber() {
        long number = -345;
        String expectedResult = "Odd";
        OddEven as = new OddEven();
        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathZero() {
        long number = 0;
        String expectedResult = "Even";
        OddEven as = new OddEven();
        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathPositiveEvenNumber() {
        long number = 222222;
        String expectedResult = "Even";
        OddEven as = new OddEven();
        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testOddEvenNegativeUndefined() {
        long number = 2147483647 + 1;
        String expectedResult = "Undefined";
        OddEven as = new OddEven();
        String actualResult = as.OddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);

    }

}
