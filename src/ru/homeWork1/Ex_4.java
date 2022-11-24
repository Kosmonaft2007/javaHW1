/*
проихвети рекурсию строки по подстрокам

использовать функции replace, indexOf, split под запретом. Для накопления ответа используем StringBuilder

Input: s = "the sky is blue"
Output: "blue is sky the"
 */

package ru.homeWork1;

public class Ex_4 {

    public static void main(String[] args) {
        String words = " the sky is blue       ";
//        String words = "a good   example"; // не отрабатывате


//        String str = reverseWords(words); //при таком раскладе не хочет правильно выводить на экран
//        System.out.println(words);

        System.out.println(reverseWords(words));
    }

    public static String reverseWords(String s) {

        int strLen = s.length();
        StringBuilder sb = new StringBuilder();

        int b = 0;
        int a = strLen - 1;


        // убираем пробелы в начале и в конце
        for (int j = 0; j < s.length(); j++) {
            if (a >= 0 && s.charAt(a) == ' ') a--;
            if (b < a && s.charAt(b) == ' ') b++;
        }

        // пробегаемся по строке буз начальных и конечных пробелах и делим ее на подстроки
        for (int i = 0; i <= a; i++) {
            while (a >= 0 && s.charAt(a) == ' ') {
                a--;
            }
            int end = a;

            while (a >= b && s.charAt(a) != ' ') {
                a--;
            }
            sb.append(s.substring(a + 1, end + 1));
            if (a > b) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}

