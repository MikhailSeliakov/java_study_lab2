package edu_lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3.

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int variable = scanner.nextInt();
		if (variable % 3 == 0) {
			System.out.println("Число " + variable + " делится на 3");
		}
		else {
			System.out.println("Число " + variable + " не делится на 3 без остатка");
		}
	}

}
