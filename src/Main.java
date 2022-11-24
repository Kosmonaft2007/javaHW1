import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        System.out.println("Hello world!");
    }

}

//public int m(int n ) {
//
//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
//        int prod = 1, sum = 0;
//        while (n>0){
//            prod = prod * (n%10);
//            sum += n%10;
//            n /= 10;
//        }
//        return prod - sum;
//    }
//}

class Solution {
    public String addBinary(String a, String b) {

        if (a.length() > b.length()) {
            String t = a;
            a = b;
            b = t;
        }
        int i = a.length() - 1;
        int car = 0;
        StringBuilder sb = new StringBuilder();
        for (int j = b.length() - 1; j >= 0; j--) {
            if (b.charAt(j) == '1') {
                car++;
            }
            if (i >= 0 && a.charAt(i) == '1') {
                car++;
            }
            sb.append(car % 2);
            i--;
            car = car / 2;
        }
        if (car == 1) sb.append(car);
        return sb.reverse().toString();
    }
}

class main1 {
    public void merge(int[] nums1,
                      int m,
                      int[] nums2,
                      int n) {
        int car =0;
    StringBuilder str = new StringBuilder();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i]>=nums2[j]) {
                    car++;
                }
                
            }


            System.out.println(str.toString());
        }
    }
}