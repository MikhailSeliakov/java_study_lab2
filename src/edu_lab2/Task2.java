package edu_lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, удовлетворяет ли введенное
// пользователем число следующим критериям: при делении на 5 в остатке
// получается 2, а при делении на 7 в остатке получается 1.

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int variable = scanner.nextInt();
		if ((variable % 5 == 2) && (variable % 7 == 1)) {
			System.out.println("Число " + variable + " удовлетворяет условиям");
		}
		else {
			System.out.println("Число " + variable + " не удовлетворяет");
		}
	}

}
