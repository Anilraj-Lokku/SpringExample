package com.anilrajlokku;
import java.util.Scanner;

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); 
        if (size <= 0 || size > 20) {
            System.out.println("Invalid Input");
            return;}        
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();          
            if (array[i] < 0) {
                System.out.println("Invalid Input");
                return;}
        }
        int product = 1;
        boolean TwoDigit = false;
        
        for (int num : array) {
            if (num >= 10 && num <= 99){
                product *= num;
               TwoDigit = true;}
        }  
        if (!TwoDigit) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("output"+" "+product);
        }    
        scanner.close();
    }
}
