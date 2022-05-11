import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PeakElementTest {
//Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
//Test Data:
//{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
    @Test
    public void testPeakElementHappyPathZero(){
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgorithm(array);

       Assertions.assertArrayEquals(actualResult, expectedResult);

    }
}
