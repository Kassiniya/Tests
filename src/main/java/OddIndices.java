public class OddIndices {
    //Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}
    public int[] oddIndices (int[] array) {
        int num = 0;
        if (array.length != 0) {
            int[] arrayOfOddIndices = new int[array.length / 2];
            for (int i = 0; i < array.length; i++) {
                if (num < arrayOfOddIndices.length) {
                    if (i % 2 != 0) {
                        arrayOfOddIndices[num] = array[i];
                        num++;
                    }
                }
            }
            return arrayOfOddIndices;
        }
        return new int[]{};
        }
    }


