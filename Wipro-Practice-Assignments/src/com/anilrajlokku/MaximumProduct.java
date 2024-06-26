package com.anilrajlokku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MaximumProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("-1");
            scanner.close();
            return;
        }

        int[] array = new int[n];
        HashSet<Integer> elementsSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            array[i] = element;
            elementsSet.add(element);
        }

        Arrays.sort(array); 

        int maxProduct = -1;
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = array[i] * array[j];
                if (elementsSet.contains(product)) {
                    maxProduct = Math.max(maxProduct, product);
                    found = true; 
                }
            }
        }

        if (!found) {
            maxProduct = -1; 
        }

        System.out.println(maxProduct);
        scanner.close();
    }
}
