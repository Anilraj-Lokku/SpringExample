package com.anilrajlokku;
import java.util.Scanner;

public class PercentageAssignment4 {  
	    public static double calculateRunningPercentage(int totalRuns, 
	    		int numberOfFours, int numberOfSixes) {
	        int totalFours = numberOfFours * 4;
	        int totalSixes = numberOfSixes * 6;
	        int totalBoundaryRuns = totalFours + totalSixes;
	        int runningRuns = totalRuns - totalBoundaryRuns;
	        return ((double) runningRuns / totalRuns) * 100;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the total runs scored: ");
	        int totalRuns = scanner.nextInt();

	        System.out.print("Enter the number of fours scored: ");
	        int numberOfFours = scanner.nextInt();

	        System.out.print("Enter the number of sixes scored: ");
	        int numberOfSixes = scanner.nextInt();

	        double runningPercentage = calculateRunningPercentage(totalRuns, 
	        		numberOfFours, numberOfSixes);
	        System.out.printf("%.2f%n", runningPercentage);
	        scanner.close();
	    }
	}


