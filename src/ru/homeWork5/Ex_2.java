package ru.homeWork5;
/*
2085. Count Common Words With One Occurrence
https://leetcode.com/problems/count-common-words-with-one-occurrence/
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex_2 {

    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> count = new HashMap<>();

        for (final String word : words1)
            count.merge(word, 1, Integer::sum);

        for (final String word : words2)
            if (count.containsKey(word) && count.get(word) < 2)
                count.merge(word, -1, Integer::sum);

        return (int) count.values().stream().filter(i -> i == 0).count();
    }
}

    /*

    import java.util.HashMap;
import java.util.Map;

public class Ex_2 {
    //    Первый вариант, прошел только 52-53 теста из 60
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words1) {
            counter.putIfAbsent(word, 0);
            counter.put(word, counter.get(word) + 1);
        }
        for (String word : words2) {
            if (!counter.containsKey(word)) {
                counter.put(word, -1);
            } else {
                counter.put(word, counter.get(word) - 1);
            }
        }
        for (var pair : counter.entrySet()) {
            if (pair.getValue() == 0) {
                count++;
            }
        }
        return count;
    }
}

     */
