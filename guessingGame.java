
//Tessa Biava
//06/23/2019
//CST-105
//This is my own work

import java.util.Scanner;
//needed to import info inputed by user

public class guessingGame { // class
	public static void main(String[] args) { // method

		// Generate a random number between 1 and 10000
		int number = (int) (Math.random() * 10001);

		Scanner input = new Scanner(System.in);
		System.out.println("Let's play a game!"); // output to user

		int guess = -1;
		while (guess != number) {
			System.out.println("Guess a number between 1 and 10000: ");
			guess = input.nextInt();

			if (guess == number) {
				System.out.print("WINNER!");
			} else if (guess > number) {
				System.out.println("LOWER");
			} else {
				System.out.println("HIGHER");
			}

		}
	}
}
