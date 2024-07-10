package java_assignments;

public class Assignment_26 {
	Assignment_26(int age) {
		System.out.println(age);

	}
	Assignment_26(double weight) {
		this(20);
		System.out.println(weight);

	}
	Assignment_26(String name) {
		this(20.5);
		System.out.println(name);

	}
	public static void main(String[] args) {
		new Assignment_26("Ashwathnarayan");
	}
}

