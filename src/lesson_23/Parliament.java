package lesson_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Parliament {

	List<Fraction> parliament = new ArrayList<>();

	void addFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name:");
		String fractionName = scan.next();
		Fraction fraction = new Fraction();
		fraction.setName(fractionName);
		parliament.add(fraction);
	}

	void removeFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name:");
		String fractionName = scan.next();
		parliament.removeIf(fraction -> fraction.getName().equals(fractionName));
	}

	void displayAllFractions() {
		parliament.stream().forEach(fraction -> System.out.println(fraction.toString()));
	}

	void displayFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name:");
		String fractionName = scan.next();
		String result = parliament.stream().filter(f -> f.getName().equals(fractionName)).findFirst().map(Fraction::toString).orElse(null);
		System.out.println(result);
	}

	void addDeputyToFraction() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter fraction name to add a deputy:");
	    String fractionName = scan.next();
	    Fraction fraction = parliament.stream().filter(f -> f.getName().equals(fractionName)).findFirst().orElse(null);

	    if (fraction != null) {
	        fraction.addDeputy();
	    } else {
	        System.out.println("Fraction not found.");
	    }
	}

	void removeDeputyFromFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name to remove a deputy.");
		String fractionName = scan.next();
		parliament.stream().filter(fraction -> fraction.getName().equalsIgnoreCase(fractionName)).findFirst()
				.ifPresent(Fraction::removeDeputy);
	}

	void showAllBribers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name to display all bribers.");
		String fractionName = scan.next();
		parliament.stream().filter(fraction -> fraction.getName().equals(fractionName)).forEach(Fraction::showBribers);
	}

	void showBiggestBriber() {
		Scanner scan = new Scanner(System.in);
		String fractionName = scan.next();
		System.out.println("Enter fraction name to display the biggest briber.");
		parliament.stream().filter(fraction -> fraction.getName().equals(fractionName))
				.forEach(Fraction::showBiggestBriber);
	}

	void showAllDeputies() {
		Scanner scan = new Scanner(System.in);
		String fractionName = scan.next();
		System.out.println("Enter fraction name to display all deputies.");
		parliament.stream().filter(fraction -> fraction.getName().equals(fractionName)).forEach(Fraction::showDeputies);
	}

	void clearFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name to clear.");
		String fractionName = scan.next();
		parliament.stream().filter(f -> f.getName().equals(fractionName)).forEach(Fraction::clearFraction);
	}
}
