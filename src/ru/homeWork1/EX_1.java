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
        int size = m + n;
        int[] dest = new int[size];

        int start1 = m;
        int start2 = n;
        int end1 = Math.min(start1 + size, nums1.length);
        int end2 = Math.min(start2 + size, nums2.length);

        // операций цикла для определения сколько нежно
        int iteration = end1 - start1 + end2 - start2;

        for (int i = 0; i < iteration; i++) {
            if (start1< end1 && (start2 >= end2 || nums1[m]<nums2[n])){
                dest[i] = nums1[m];
                m++;
            }else {
                dest[i] = nums2[n];
                n++;
            }
            System.out.println(dest[i]);
        }


    }

}
