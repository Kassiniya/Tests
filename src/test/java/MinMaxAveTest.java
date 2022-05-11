import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MinMaxAveTest {
//Написать алгоритм MinMaxAve, который принимает массив чисел int[] и 2 значения индексов.
// Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
// и среднее среди всех значений между 2-мя индексами.
//Test Data:
//({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

@Test

public void testMinMaxAveHappyPass() {
    int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
    int start = 2;
    int end = 3;
    int[] expectedResult = {3, 4, 3};

    MinMaxAve as = new MinMaxAve();
    int[] actualResult = as.minMaxAve (array,start,end);

    Assertions.assertArrayEquals(expectedResult, actualResult);
}
    @Test
    public void testMinMaxAveEmptyArray() {
        int [] array = {};
        int start = 2;
        int end = 6;
        int[] expectedResult = new int[] {};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAve (array,start,end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxAveNegative() {
        int [] array = {1,5,7};
        int start = -2;
        int end = 6;
        int[] expectedResult = new int[] {};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAve (array,start,end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxAveEqualsIndex() {
        int [] array = {5,6,9};
        int start = 2;
        int end = 2;
        int[] expectedResult =  {9,9,9};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAve (array,start,end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test

    public void testMinMaxAveZeroValue() {
        int [] array = {0, 0, 0, 0, 0, 0, 0, 0};
        int start = 2;
        int end = 6;
        int[] expectedResult = {0, 0, 0};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAve (array,start,end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxAveTwoValues() {
        int [] array = {4, 20};
        int start = 0;
        int end = 1;
        int[] expectedResult = {4, 20, 12};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAve (array,start,end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test

    public void testMinMaxAveHappyPass1() {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAve (array,start,end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxAveNegativePath() {
        int [] array = {5,6,9};
        int start = 2;
        int end = 4;
        int[] expectedResult =  {};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAve (array,start,end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
