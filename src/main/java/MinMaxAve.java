public class MinMaxAve {
    //Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    // Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
    // и среднее среди всех значений между 2-мя индексами.
    //Test Data:
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    public static int[] minMaxAve(int[] array, int start, int end) {
        if (array.length == 0 || array.length < 1 || start < 0
                || end > array.length || start > end) {
            return new int[]{};
        }
        int minValue = array[start];
        int maxValue = array[end];
        int aveValue = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (array[start] < array[i]) {
                maxValue = array[i];
            }
            if (array[start] > array[i]) {
                minValue = array[i];
            }
            sum += array[i];
        }
        aveValue = sum / (end - start + 1);
        int[] result = {minValue, maxValue, aveValue};
        return result;
    }
}

