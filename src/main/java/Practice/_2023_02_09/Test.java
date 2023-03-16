package Practice._2023_02_09;

public class Test  {

    public static void main(String[] args) {
        // Task 1
        int[] arr1 = {1, 5, 4, 8, 9, 3, 2, 6};
        int num = 11;

        HW.getTwoNumbers(arr1, num);

        // Task 2
        int[] arr2 = {1, 10, 5, 4, 11, 9, 2, 14, 6, 21, 54, 44, 8, 19, 3, 12, 16};

        System.out.println("Is Duplicated: " + HW.isDuplicated(arr2));

        // Task 3
        int n = 11;
        int[] nums = {1, 1, 5, 4, 1, 9, 2, 4, 6};

        int minSec = HW.getMinSequence(nums, n);
        if (minSec == Integer.MAX_VALUE) {
            System.out.println("There is no sequence with sum = " + n); // Если минимальная длина последовательности не изменилась, то значит последовательность не найдена
        } else {
            System.out.println("Min Sequence length: " + minSec); // Выводим минимальную длину последовательности
        }
    }
}
