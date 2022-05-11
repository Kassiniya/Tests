import org.junit.jupiter.api.*;
public class BiggerValueTest {
    //4.	Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    //Test Data:
    //3333, 9999
    //Expected Result = 9999
    @Order(1)
    @Test
    public void testBiggerValuePositiveNumber() {
        int a = 5;
        int b = 15;
        int expectedResult = 15;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testBiggerValueNegativeNumber() {
        int a = -8;
        int b = -10;
        int expectedResult = -8;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testBiggerZero() {
        int a = 5;
        int b = 0;
        int expectedResult = 5;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
