package java_assignments;

//multilevel inheritance for non static methods

	class Superr_class{
		 void add() {
			System.out.println("Super Class is output");
		}
	}

	class Subb_class extends Superr_class{
		 void sub() {
			System.out.println("Sub Class is output");
		}
		
	}

public class Assignment_21 extends Subb_class{
	
	 void mul() {
		System.out.println("Child Class is output");
	}
	public static void main(String[] args) {
		Assignment_21  a1=new Assignment_21 ();
		a1.add();
		a1.sub();
		a1.mul();
		
	}
}
	
	



