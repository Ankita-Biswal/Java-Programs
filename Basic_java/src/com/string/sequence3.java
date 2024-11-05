package com.string;

import java.util.Scanner;

public class sequence3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one string:");
        String s = sc.nextLine();
        
        int[] count = new int[256]; 
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;  
            
            if ( count[c] > 1) {
                res.append('$');  
            } else {
                res.append(c); 
            }
        }

        System.out.println(res.toString());
        
    }
}