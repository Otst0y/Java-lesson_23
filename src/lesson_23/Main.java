package lesson_23;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Enter 1 to add a Fraction.");
		System.out.println("Enter 2 to remove a Fraction.");
		System.out.println("Enter 3 to display all Fractions.");
		System.out.println("Enter 4 to clear a Fraction.");
		System.out.println("Enter 5 to display a Fraction.");
		System.out.println("Enter 6 to add a Deputy to a Fraction.");
		System.out.println("Enter 7 to remove a Deputy from a Fraction.");
		System.out.println("Enter 8 to display all Bribers.");
		System.out.println("Enter 9 to display the biggest Briber.");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Fraction fraction = new Fraction();
		Parliament p = new Parliament();

		while (true) {
			menu();

			int menuScan = scan.nextInt();

			switch (menuScan) {
			case 1:
				p.addFraction();
				break;
			case 2:
				p.removeFraction();
				break;
			case 3:
				p.displayAllFractions();
				break;
			case 4:
				p.clearFraction();
				break;
			case 5:
				p.displayFraction();
				break;
			case 6:
				p.addDeputyToFraction();
				break;
			case 7:
				p.removeDeputyFromFraction();
				break;
			case 8:
				p.showAllBribers();
				break;
			case 9:
				p.showBiggestBriber();
				break;
			default:
				System.out.println("Invalid input.");
			}
		}
	}
}