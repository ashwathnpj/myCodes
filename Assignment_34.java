package java_assignments;

//Abstract class (2 abstract methods,2 concrete methods) and class have 2 concrete methods

abstract class Facebook {
	abstract void mul();
	abstract void mul1();
	
	public static void sub() {
		System.out.println("Parent Concrete Method1");

	}

	public static void sub1() {
		System.out.println("Parent Concrete Method2");
	}
	
	
}

public class Assignment_34 extends Facebook {
	@Override
	void mul() {
		System.out.println("Parent Abstract Method1");
		
	}

	@Override
	void mul1() {
		System.out.println("Parent Abstract Method2");
		
	}
	public static void add() {
		System.out.println("Child Concrete Method1");

	}

	public static void add1() {
		System.out.println("Child Concrete Method2");
	}
	
	

	public static void main(String[] args) {
		Assignment_34 c1=new Assignment_34();
		c1.mul();
		c1.mul1();
		Facebook.sub();
		Facebook.sub1();
		add();
		add1();

	}

	

}
