package Session_8.methods;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers for addition");
		Scanner sc = new Scanner(System.in);
		int numOne = sc.nextInt();
		int numTwo = sc.nextInt();
		sc.close();
		
		userDefined_Methods obj = new userDefined_Methods();
		int total = obj.add(numOne, numTwo);
		System.out.println(total);
		
		
		
		
		
		
		
		
	}

}
