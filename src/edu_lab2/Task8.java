package edu_lab2;

import java.util.Scanner;
// Timus 1131
public class Task8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int result = calculateMinimumTime(N, K);
        System.out.println(result);
    }
    public static int calculateMinimumTime(int N, int K) {
        if (N <= K) {
            return 1;
        }
        int computersPerConnection = N / K;
        if (N % K == 0) {
            return K;
        }
        return computersPerConnection + 2;
    }
}
