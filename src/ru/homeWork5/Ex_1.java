package ru.homeWork5;
/*


 */

import java.util.HashMap;
import java.util.Map;

public class Ex_1 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int pre = map.get(nums[i]);
                if (i - pre <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
