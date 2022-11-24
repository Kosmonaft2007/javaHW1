/*
является ли палиндром


использовать toLowerCase метод на строке под запретом. Посмотрите в сторону Character.toLowerCase Character.isLetterOrDigit.
Перевести символ в нижний регистр дешевле, чем создавать новую строку.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

package ru.homeWork1;

public class Ex_5 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char l;
        char r;
        while (left <= right) {
            l = s.charAt(left);
            r = s.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
