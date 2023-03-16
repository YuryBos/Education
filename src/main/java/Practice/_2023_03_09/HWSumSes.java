package Practice._2023_03_09;

public class HWSumSes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int[] numbers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("Task 1. " + removeDuplicates(nums));

        System.out.println(findNonDuplicateNumber(numbers));

    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == nums[i + 1]) {
//                k++;
//            }
//        }
        return k;
        }

    private static int findNonDuplicateNumber(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result = numbers[i];
                break;
            }
        }
        return result;
    }
  /*  Task 1.
    Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element
    appears only once. The relative order of the elements should
    be kept the same.

            Example 1:
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2,
    with the first two elements of nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k
    (hence they are underscores).

    Example 2:
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,,,,,_]
    Explanation: Your function should return k = 5,
    with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are
    underscores).

    Task 2.
    Given a non-empty array of integers nums, every element appears
    twice except for one. Find that single one.
    Example 1:
    Input: nums = [2,2,1]
    Output: 1

    Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4

    Example 3:
    Input: nums = [1]
    Output: 1*/
}
