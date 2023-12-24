package edu_lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, попадает
// ли введение пользователем число в диапазон от 5 до 10 включительно.

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int variable = scanner.nextInt();
		if ((variable >= 5) && (variable <= 10)) {
			System.out.println("Число " + variable + " удовлетворяет условиям");
		}
		else {
			System.out.println("Число " + variable + " не удовлетворяет");
		}

	}

}
