package edu_lab2;

import java.util.Scanner;

// Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе
// (определяется четвертая цифра справа в десятичном представлении числа).

public class Task5 {

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
