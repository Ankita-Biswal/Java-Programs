package com.string;
import java.util.*;

public class Reversewords1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one String:");
        String s = sc.nextLine();
        System.out.println(rev(s));
       
    }

    public static String rev(String s) {
        int j = s.length() - 1;
        String s2 = "";

        while (j >= 0) {
           
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            
            int end = j;

            
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            
            if (s2.length() > 0) {
                s2 += " ";
            }
            s2 += s.substring(j + 1, end + 1);
        }

        return s2;
    }
}
