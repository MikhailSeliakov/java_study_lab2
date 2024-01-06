package edu_lab2;

import java.util.Scanner;
// Timus 1001 https://acm.timus.ru/problem.aspx?space=1&num=1001
public class Task6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.useDelimiter("\\A").next();
        
        String[] numbers = input.trim().split("\\s+");
        
        for (int i = numbers.length - 1; i >= 0; i--) {
        	System.out.println();
            long num = Long.parseLong(numbers[i]);
            double squareRoot = Math.sqrt(num);
            System.out.printf("%.4f%n", squareRoot);
        }
	}
}
