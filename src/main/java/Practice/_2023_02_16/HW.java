package Practice._2023_02_16;

public class HW {
    public static void main(String[] args) {

        System.out.println(findNonRepeatedNumber(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(findMissingNumber(new int[]{1, 0, 2, 8, 6, 5, 4, 7}));
        System.out.println(findNumberConsistingOfOwnDivisors(new int[]{
        1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22, 24, 33, 36, 44, 48, 55, 66, 77, 88, 99, 111, 112, 115, 122, 124, 126, 128, 132, 135, 144}));

    }
//    1. Дан массив чисел в котором все числа имеют повторения, кроме одного числа. Найти это число
public static int findNonRepeatedNumber(int[] nums) {
    int result = 0; // 0 ^ 0 = 0, 0 ^ 1 = 1, 1 ^ 1 = 0 и т.д. - это свойство XOR операции (побитовое исключающее ИЛИ)
    for (int num : nums) {
        result ^= num; // XOR операция - если два числа одинаковые, то результат будет 0
    }
    return result;
}
//    2. Дан массив чисел, в котором есть все числа от 0 до N. Все эти числа в единственном экземпляре.
//    Расположены в разнобой. Одно число в этом массиве пропущено (Например {1 0 2 8 6 5 4 7} - это 3).
//    Найти пропущенное число
public static int findMissingNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
        result ^= i ^ nums[i]; // если в массиве есть все числа от 0 до N, то результат XOR операции будет равен N
    }
    return result ^ nums.length;
}
//    3. Дан массив чисел. Найти число состоящее из собственных делителей.
//    Например, число 128 состоит из 1 2 и 8. 128 % 1 == 0 , 128 % 2 == 0 и 128 % 8 == 0. Вот такие числа надо найти.
public static int findNumberConsistingOfOwnDivisors(int[] nums) {
    for (int num : nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sb.append(i);
            }
        }
        int newNum = Integer.parseInt(sb.toString());
        if (newNum == num) {
            return num;
        }
    }
    return 0;
}

//    4. Ну и для особо отличившихся. Написать метод, который
//    генерирует двумерный массив длиной N и высотой H
//    Далее заполняет получившийся массив числами от 1 до W по спирали.
//    Например массив [ ][ ][ ][ ]
//            [ ][ ][ ][ ]
//            [ ][ ][ ][ ]
//    имеет N == 4 and H == 3 и вид [ 1 ][ 2 ][ 3 ][ 4 ]
//            [10][11][12 ][ 5 ]
//            [9 ][8 ][ 7 ][ 6 ]
}
