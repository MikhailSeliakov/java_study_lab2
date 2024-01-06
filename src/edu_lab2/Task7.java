package edu_lab2;

import java.util.Scanner;

//Timus 1068 https://acm.timus.ru/problem.aspx?space=1&num=1068
public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
       	int n = scanner.nextInt();
       	int sum = calculateSum(n);
        System.out.println(sum);
	}

    private static int calculateSum(int n) {
        int sum = 0;
        if (n < 0) {
            for (int i = 1; i >= n; i--) {
                sum += i;
            }
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
