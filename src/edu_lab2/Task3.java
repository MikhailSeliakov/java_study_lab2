package edu_lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, удовлетворяет ли
// введенное пользователем число следующим критериям:
// число делится на 4, и при этом оно не меньше 10.

public class Task3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int variable = scanner.nextInt();
		if ((variable % 4 == 0) && (variable > 10)) {
			System.out.println("Число " + variable + " удовлетворяет условиям");
		}
		else {
			System.out.println("Число " + variable + " не удовлетворяет");
		}
	}
}
