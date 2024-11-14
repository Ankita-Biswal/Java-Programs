package com.searching;

public class BinarySearchUsingRecursion {

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10, 12, 14};
        int elementToSearch = 6;
        
        int result = search(a, elementToSearch, 0, a.length - 1);
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    static int search(int[] a, int e, int start, int end) {
        if (start > end) return -1; 

        int mid = start + (end - start) / 2; 
        if (e == a[mid]) return mid; 
        
        if (e < a[mid]) {
            return search(a, e, start, mid - 1); 
        } else {
            return search(a, e, mid + 1, end); 
        }
    }
}
