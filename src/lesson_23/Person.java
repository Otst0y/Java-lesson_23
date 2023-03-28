package lesson_23;

public class Person {
	int weight;
	int height;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + "]";
	}
}
