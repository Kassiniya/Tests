public class PeakElement {
    //i == array.length -1 - последний элемент
    public int[] peakElementAlgorithm(int[] array) {
        int[] result = {};
        int count = 0;
        if (array[0] > array[1] || array[array.length - 1] > array[array.length - 2]) {
            count += 1;
        }
        for (int i = 1; i < array.length-1; i++){
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count++;
            }
            }
        if (count == 0){
            return result;
        }
        result = new int[count];
        count = 0;
        for (int i = 0; i < array.length; ){
            if (i == 0){
                if (array[i] > array[i + 1]){
                    result[count] = array[i];
                    count++;
                    i = i + 1;
                }else{
                    i = i + 1;
                }
            }else if (array[i] > array[i - 1] && array[i] > array [i + 1]){
                result[count] = array[i];
                count++;
                i = i + 1;
                }else if (i == array.length - 1){
                if(array[array.length - 1] > array[array.length - 2]){
                    result[count] = array[array.length - 1];
                }
            }
        }
    return result;

    }
}
