package ru.homeWork2;

public class Zero0 {
    public static void main(String[] args) {
        //Recursion

        System.out.println(sum(10)); // 1 - n
    }
    public static int sum(int n){

        if (n ==1) return 1;   // Base step
        return n + sum(n-1);// recursive step
        /*
        ДЭкомпозиция
        10 + sun (9) = 9 + sun (8) = 8 + sun (7) =... =  1 + sun (0)
        Выполнился Base step
        Композиция (собирает обратно)
        10 + sun(9) = 45
        10 + 9 + sun(8) = 36
        10 + 9 + 8 + sun(7) = 28
        10 + 9 + 8 + 7 + sun(6) = 21
        10 + 9 + 8 + 7 + 6 + sun(5) = 15
        10 + 9 + 8 + 7 + 6 + 5 + sun(4) = 10
        10 + 9 + 8 + 7 + 6 + 5 + 4 + sun(3) = 6
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + sun(2) = 3
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + sun(1) = 1
        sun(10) = 55
         */
    }
}
