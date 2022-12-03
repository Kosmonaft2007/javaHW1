/*
проихвети рекурсию строки по подстрокам

использовать функции replace, indexOf, split под запретом. Для накопления ответа используем StringBuilder

Input: s = "the sky is blue"
Output: "blue is sky the"
 */
package ru.homeWork1;

public class EX_1 {
    public void merge(int[] nums1,
                      int m,
                      int[] nums2,
                      int n) {
//        int size = m + n;
//        int[] dest = new int[size];
//
//        int start1 = m;
//        int start2 = n;
//        int end1 = Math.min(start1 + size, nums1.length);
//        int end2 = Math.min(start2 + size, nums2.length);
//
//        // операций цикла для определения сколько нежно
//        int iteration = end1 - start1 + end2 - start2;
//
//        for (int i = 0; i < iteration; i++) {
//            if (start1< end1 && (start2 >= end2 || nums1[m]<nums2[n])){
//                dest[i] = nums1[m];
//                m++;
//            }else {
//                dest[i] = nums2[n];
//                n++;
//            }
//            System.out.println(dest[i]);
//        }
        int index = m + n - 1;
        int indexNums1 = m - 1, indexNums2 = n - 1;

        while (indexNums2 >= 0) {
            if (indexNums1 < 0) {
                nums1[index--] = nums2[indexNums2--];
            } else {
                if (nums2[indexNums2] >= nums1[indexNums1]) {
                    nums1[index--] = nums2[indexNums2--];
                } else {
                    nums1[index--] = nums1[indexNums1--];
                }
            }
        }
 /*
 public class arr {

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = nums1.length;
        int[] nums2 = {2,5,6};
        int n = nums2.length;
        for (int i = m-3; i < m; i++) {
            nums1[i] = nums2[i-3];
        }
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < nums1.length; i++) {
                if (nums1[i] < nums1[i - 1]) {
                    swap(nums1, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
  */

    }

}
