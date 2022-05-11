public class SumOfTwo {
    //
    public int[][] sumOfTwoAlgoritm(int[] a, int sum) {
        if (a.length > 0) {

            int[] b = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (sum == (a[i] + a[j])) {
                        count++;
                        a[i] = -2147483648;
                    }
                }
            }

            int[][] result = new int[count][2];

            count = 0;
            for (int i = 0; i < b.length; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (sum == b[i] + b[j]) {
                        result[count][0] = b[i];
                        result[count][1] = b[j];
                        count++;
                        b[i] = -2147483648;
                    }
                }
            }

            return result;
        }

        return new int[][]{};
    }
//
public int[][] sumOfTwoAlgorithms(int[] array, int n) {
    int[][] result = {{}};
    int count = 0;

    if (array.length > 0) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    count++;
                }
            }
        }
        result = new int[count][2];
        count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    result[count][0] = array[i];
                    result[count][1] = array[j];
                    count++;
                }
            }
        }
    }

    return result;
}

}
