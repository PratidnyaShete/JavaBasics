package Session_8.methods;

import java.util.Scanner;

public class UserInputs {
public static void main(String args[]) {
	
	System.out.println("Please enter country name");
	Scanner sc = new Scanner(System.in);
	String userInput = sc.next();
	sc.close();
	
	
	userDefined_Methods objRef = new userDefined_Methods();
	String countryCapName = objRef.countryCapital(userInput);
	System.out.println(countryCapName);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
