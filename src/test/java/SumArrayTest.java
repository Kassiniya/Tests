import org.junit.jupiter.api.*;
public class SumArrayTest {
    ////3.	Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    //    //
    //    //Test Data:
    //    //{0, 1, 2, 3, 4, 5} → 15
    //    //{-7, -3} → -10

    @Test
    public void testSumArrayPositiveNumber() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray as = new SumArray();
        int actualResult = as.sumArray(array);


        Assertions.assertEquals(expectedResult, actualResult);


    }
    @Test
    public void testSumArrayNegativeNumber() {
        int[] array = {-80, -4, -6};
        int expectedResult = -90;

        SumArray as = new SumArray();
        int actualResult = as.sumArray(array);


        Assertions.assertEquals(expectedResult, actualResult);


    }
    @Test
    public void testSumArrayZero() {
        int[] array = {0, 0, 0};
        int expectedResult = 0;

        SumArray as = new SumArray();
        int actualResult = as.sumArray(array);


        Assertions.assertEquals(expectedResult, actualResult);


    }
    @Test
    public void testSumArrayNegative() {
        int[] array = {};
        int expectedResult = 0;

        SumArray as = new SumArray();
        int actualResult = as.sumArray(array);


        Assertions.assertEquals(expectedResult, actualResult);

    }
}