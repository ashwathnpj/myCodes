package java_assignments;
//Other String Functions and matches 

public class Assignment_37 {
	public static void main(String[] args) {
		String name="Ashwathnarayan Joshi";
		String name1="Abcd";
		String name2="My city is Mysore";
		String name3="manish kumar tiwari";
		String name4="tom";
	 	System.out.println(name.isEmpty());
	 	System.out.println(name.lastIndexOf('a'));
	 	System.out.println(name1.replace('d', 'a'));
	 	System.out.println(name2.replaceAll("Mysore", "Bengaluru"));
	 	
	 	System.out.println(name3.matches("(.*)i"));
	 	System.out.println(name3.matches("m(.*)"));
	 	System.out.println(name3.matches("(.*)k(.*)"));
	 	System.out.println(name4.matches("..."));
	 	
	 	
	 	
	 	
	}

}
