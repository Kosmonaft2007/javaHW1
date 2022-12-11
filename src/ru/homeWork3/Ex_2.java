package ru.homeWork3;

import java.util.*;
/*

Дан массив целых чисел (List<Integer) удалить из него целые числа.
Посмотрите на метод removeAll (можно сохранить все четные значения в другой список
и передать его в removeAll или используйте итератор)
 */

public class Ex_2 {

    public static void main(String[] args) {
//        List<Integer> ls = new ArrayList<>();
//        ls.add(0);
//        ls.add(3);
//        ls.add(2);
//        ls.add(5);
//        ls.add(4);
        Integer[] num = {6, 8, 3, 5, 1, 9};
        List<Integer> ls = new ArrayList<>(Arrays.asList(num));
        System.out.println(ls);
        System.out.println(DeleteAll(ls));
    }

    public static List<Integer> DeleteAll(List<Integer> ls) {
        List<Integer> newls = new ArrayList<>();
        for (int i = 0; i < ls.size(); i += 2) {
            newls.add(ls.get(i));
        }
        ls.removeAll(newls);
//        ls.clear();
        System.out.println(newls);
        return ls;
    }
}
