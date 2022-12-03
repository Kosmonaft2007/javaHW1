package ru.homeWork2;

public class Zero2 {
    public static void main(String[] args) {
        String s = "appel";
        System.out.println(revers(s));
    }

    private static String revers(String s) {
        // base step
        if (s.length() == 1) return s;
        // recursion step
        return s.charAt(s.length() - 1) + revers(s.substring(0, s.length() - 1)); // l + rev(e) = e + rev(p)  =
    }
}
