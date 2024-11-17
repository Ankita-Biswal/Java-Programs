package com.SortingAlgo;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] a = {5, 8, 7, 4, 2, 1, 9, 6};
        heapSort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }

    static void heapSort(int[] a) {
        int n = a.length;

        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

           
            heapify(a, i, 0);
        }
    }

    static void heapify(int[] a, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        
        if (left < n && a[left] > a[largest]) {
            largest = left;
        }

        if (right < n && a[right] > a[largest]) {
            largest = right;
        }

       
        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

          
            heapify(a, n, largest);
        }
    }
}
