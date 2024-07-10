package java_assignments;

class Grandparent {
	void newGrandparent() {
		System.out.println("Grandparent class");
	}
}

class Class1 extends Grandparent {
	void newClass1() {
		System.out.println("Class1 class");
	}
}

class Parent extends Grandparent {
	void newParent() {
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	void newChild() {
		System.out.println("Child class");
	}
}

public class Assignment_24 {
	public static void main(String[] args) {
		Child child = new Child();

		child.newGrandparent();
		child.newParent();
		child.newChild();
		/* child.newClass1();//It will show Error */
		

	}

}

