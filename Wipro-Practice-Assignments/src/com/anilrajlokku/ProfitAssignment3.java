package com.anilrajlokku;

import java.util.Scanner;

    public class ProfitAssignment3 {
    
    public static double calculateShare(double profit, 
    		int individualRatio, int totalRatio) {
        return (profit * individualRatio) / totalRatio;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double profit = scanner.nextDouble();

        int ramuRatio = scanner.nextInt();
        int gopuRatio = scanner.nextInt();
        int samuRatio = scanner.nextInt();
        int totalRatio = ramuRatio + gopuRatio + samuRatio;

        double ramuProfit = calculateShare(profit, ramuRatio, totalRatio);
        double gopuProfit = calculateShare(profit, gopuRatio, totalRatio);
        double samuProfit = calculateShare(profit, samuRatio, totalRatio);

        System.out.printf("%.2f%n", ramuProfit);
        System.out.printf("%.2f%n", gopuProfit);
        System.out.printf("%.2f%n", samuProfit);
        scanner.close();
    }
    
}
