/*
без создания нового массива, работаем с тем, что дано
перебрать и удалить из массива указанный элемент val


Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

package ru.homeWork1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_3 {


    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 23, 0, 3, 9, 7};
        int val = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int n = sc.nextInt();
//        System.out.println("Введите значение которое нужно заменить : ");
//        int val = sc.nextInt();
//        int[] nums = new int[n];
//        System.out.println("Введите  массива: ");
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
//        }
        int a = removeElement(nums, val);
//        System.out.println(removeElement(nums, val)); // тута 8 ??????
        System.out.println(a); // тута 5 ?????
    }

    static int removeElement(int[] nums, int val) {
        int copyInd = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd++;
                k++;
                System.out.print(nums[i] + " ");
            }
        }
        while (copyInd < nums.length-1) {
            nums[copyInd++] = '_';
        }
//        System.out.println(nums[copyInd] + " ");
        return k; // как вывести два значения ???????
    }
}
