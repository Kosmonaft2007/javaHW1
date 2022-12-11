package ru.homeWork5;

/*
350. Intersection of Two Arrays II
https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */

import java.util.*;

public class Ex_3 {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1) {
                    map.put(i, map.get(i) - 1);
                } else {
                    map.remove(i);
                }
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        while (i < list.size()) {
            result[i] = list.get(i);
            i++;
        }
        return result;
    }
}
