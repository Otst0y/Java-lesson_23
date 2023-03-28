package lesson_23;

import java.util.Scanner;

public class Deputy extends Person {

	String name;
	String lastName;
	int age;
	boolean isBriber;
	int bribeAmount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBriber() {
		return isBriber;
	}

	public void setBriber(boolean isBriber) {
		this.isBriber = isBriber;
	}

	public int getBribeAmount() {
		return bribeAmount;
	}

	public void setBribeAmount(int bribeAmount) {
		this.bribeAmount = bribeAmount;
	}

	public Deputy(String name, String lastName, int age, boolean isBriber) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.isBriber = isBriber;
	}

	@Override
	public String toString() {
		return "Deputy [name = " + name + ", lastName = " + lastName + ", age = " + age + ", isBriber = " + isBriber
				+ "]";
	}

	void bribe() {
		if (isBriber == false) {
			System.out.println("This deputy does not take bribes.");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter bribe amount:");
			int bribeAmount = scan.nextInt();
			if (bribeAmount > 5000) {
				System.out.println("Police will arrest deputy.");
			} else {
				setBribeAmount(bribeAmount);
			}
		}
	}
}
