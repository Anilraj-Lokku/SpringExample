package com.anilrajlokku;
import java.util.Scanner;
public class DiceGameAssignment1 {	
	    public static void main(String[] args) {
	        Scanner ab = new Scanner(System.in);
	        System.out.println("Enter Value 1:");
	        int value1 = ab.nextInt();
	        System.out.println("Enter Value 2:");
	        int value2 = ab.nextInt();
	        if (value1 < 0 || value1 > 6 || value2 < 0 || 
	        		value2 > 6){
	            System.out.println("Invalid  Input ");
	        } else {
	            int sum = value1 + value2;
	            int points;
	            int difference = Math.abs(8 - sum);
	            if (sum < 8) 
	            {
	                points = difference;
	            } else 
	            {
	                points = 2 * difference;
	            }
	            System.out.println("The points Scored is: " + 
	                        points);
	        }
	        ab.close();
	    }
	}

