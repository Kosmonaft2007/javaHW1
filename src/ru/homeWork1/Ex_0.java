package ru.homeWork1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_0 {


    //    public int removeElement(int[] nums, int val) {
//        int cop =0;
//        for (int i = 0;  i< nums.length; i++) {
//            if (nums[i] != 0){
//                nums[cop] = nums[i];
//                cop+= 1;
//            }
//        }
//        while (copyInd < nums.length) {
////            nums[copyInd] = 0;
////            copyInd++;
////        }


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
        removeElement(nums, val);
    }

    static void removeElement(int[] nums, int val) {
        int copyInd = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd++;
                k++;
//                System.out.print(nums[i] + " ");
            }
        }

        System.out.println(k);

        while (copyInd < nums.length) {
            nums[copyInd] = val;
            copyInd++;

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
//        String res = Arrays.toString(nums);
//        System.out.print(res);
//        while (val < res.length()){
//            val = '_';
//        }

    }

}


