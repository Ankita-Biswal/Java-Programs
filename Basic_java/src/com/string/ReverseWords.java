package com.string;
import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one String:");
        String s = sc.nextLine();
        System.out.println(rev(s));
        sc.close();
    }

    public static String rev(String s) {
        int i = 0;
        int j = 0;
        String s2 = "";
        while (j < s.length()) {
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
          
            String temp = "";
            for (int k = j - 1; k >= i; k--) {
                temp += s.charAt(k);
            }
            s2 += temp;

           
            if (j < s.length()) {
                s2 += " ";
            }
            j++;
            i = j;
        }
        return s2;
    }
}
