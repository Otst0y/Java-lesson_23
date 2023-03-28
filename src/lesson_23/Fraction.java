package lesson_23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fraction {
	String name;
	List<Deputy> deputies = new ArrayList<>();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addDeputy() {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter deputy's name:");
	    String depName = scan.next();
	    System.out.print("Enter deputy's last name:");
	    String depLastName = scan.next();
	    System.out.print("Enter deputy's age:");
	    int depAge = scan.nextInt();
	    System.out.print("Enter is the deputy a briber? (true/false):");
	    boolean depBriber = scan.nextBoolean();
	    Deputy dep = new Deputy(depName, depLastName, depAge, depBriber);
	    deputies.add(dep);
	    System.out.println("Deputy added successfully.");
	}

	void removeDeputy() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter deputy's name.");
		String depName = scan.next();
		System.out.println("Enter deputy's last name.");
		String depLastName = scan.next();
		deputies = deputies.stream()
				.filter(deputy -> !deputy.getName().equals(depName) && !deputy.getLastName().equals(depLastName))
				.collect(Collectors.toList());
	}

	void showBribers() {
		deputies.stream().filter(Deputy::isBriber).forEach(System.out::println);
	}

	void showBiggestBriber() {
		Deputy biggestBriber = deputies.stream().filter(Deputy::isBriber)
				.max(Comparator.comparingInt(deputy -> deputy.getBribeAmount())).orElse(null);
		System.out.println(biggestBriber);
	}

	void showDeputies() {
		deputies.stream().forEach(System.out::println);
	}

	void clearFraction() {
		deputies.clear();
	}

	@Override
	public String toString() {
		return "Fraction [name=" + name + ", deputies=" + deputies + "]";
	}
}
