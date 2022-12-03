package ru.homeWork2;

public class Zero1 {
    public static void main(String[] args) {
        // Factorial
        System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        // base step
        if (n == 1) return 1;
        // recursive step
        return n * factorial(n - 1);
    }
}
