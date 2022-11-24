
/*
Перебрать массив ио значению в качестве индекса


Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
 */
package ru.homeWork1;

public class Ex_2 {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        int [] a = buildArray(nums);
        System.out.println(a);     //????? чего-то не хочет выводиться массив
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {

            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
