
import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {
    //Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}
    @Test
    public void testOddIndicesHappyPathPositiveNumber() {
        int[] array = {5, 10, 3, 4};
        int[] expectedResult = {10, 4};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndices(array);

        Assertions.assertArrayEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddIndicesHappyPathNegativeNumber() {
        int[] array = {-5, -11, 0, 4};
        int[] expectedResult = {-11, 4};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
