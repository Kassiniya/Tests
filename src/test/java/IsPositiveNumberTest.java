import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IsPositiveNumberTest {
   // 5.	Напишите алгоритм IsPositiveNumber, который возвращает true,
    // если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
   @Order(1)
   @Test
   public void testIsPositiveNumberZero() {
       int a = 0;
       boolean expectedResult = true;

       IsPositiveNumber as = new IsPositiveNumber();
       boolean actualResult = as.isPositiveNumber(a);

       Assertions.assertEquals(expectedResult, actualResult);
   }
    @Order(2)
    @Test
    public void testIsPositiveNumberPositiveValue() {
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testIsPositiveNumberNegativeValue() {
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
