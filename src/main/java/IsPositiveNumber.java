public class IsPositiveNumber {
    //5.	Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
    //Проверьте работу метода на числах 555, 0 и -555.
    public boolean isPositiveNumber (int a) {
        if (a < 0) {
            return false;
        }else{
            return true;
        }
    }
    public boolean isPositiveNumber1 (int a) {
        //return a >= 0? true: false; Тернарный оператор
        return a >= 0;

    }
}
