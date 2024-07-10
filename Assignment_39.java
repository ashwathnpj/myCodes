package java_assignments;
//indexing double and boolean data type using scanner class
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_39 {
	public static void main(String[] args) {
		double weight[]=new double[3];
		Scanner s1=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			weight[i]=s1.nextDouble();
			
		}
		System.out.println(Arrays.toString(weight));
		
		boolean gender[]=new boolean[3];
		for(int i=0; i<3; i++) {
			gender[i]=s1.nextBoolean();
			
		}
		System.out.println(Arrays.toString(gender));
		
	}

}
