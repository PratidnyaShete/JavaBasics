package Session_3;

public class ConditionalOperator {
public static void main(String args[]) {
	
	//compare and validate between two or more values
	// == : comparison operator
	// >  :
	// <  :
	// >= :
	// <= :
	// != : not
	// && : and
	// || : or
	
	//Example 1
//	int a = 20;
//	int b = 10;
	//if(a>b)
	//{
	//	System.out.println("a is greater than b");
	//}
	//else
	//{
		//System.out.println("b is greater than a");
	//}
	System.out.println("------------------------------");
	//if(a==b) {
		//System.out.println("Both values are equal");
	//}
	//else if(a>b) {
	//	System.out.println("a is greater than b");
	//}
	//else {
		//System.out.println("b is greater than a");
	//}
	System.out.println("-------------------------------");
//	if(b>=a) {
//		System.out.println("b is either greater or equal to a");
//	}
//	else {
//		System.out.println("a is greater than b");
//	}
	System.out.println("-------------------------------");
	
//	int total = 200;
//	if(!(total==0)) {
//		System.out.println("You are eligible for discount");
//	}
//	else {
//		System.out.println("You are not eligible for discount");
//	}
	System.out.println("-------------------------------");
//	if(false) {
	//	System.out.println("hii there");
	//}
	//else {
	//	System.out.println("Bye");
	//}
	System.out.println("-------------------------------");
	
	// Nested if
	
//	int num = 10;   // Number should be greater than 10 and then check if it is 15 or 17 otherwise say it is less than or equal to 10
//	if(num>10) {
//		if(num==15) {
//			System.out.println("Number is equal to 15");
//		}
//		if(num==17) {
//			System.out.println("Number is equal to 17");
//		}
//	}
//	else {
//		System.out.println("Number is less than or equal to 10");
//	}
	System.out.println("-------------------------------");	
	
//	int number = 20;  // check if number is 10, 20, 30 else say number not found
//	if(number == 10) {
//		System.out.println("Number is 10");
//	}
//	else if(number == 20) {
//		System.out.println("Number is 20");
//	}
//	else if(number == 30) {
//		System.out.println("Number is 30");
//	}
//	else {
//		System.out.println("Number is not found");
//	}
	
	// Write a program to find highest from 3 numbers
	int x = 1000;
	int y = 20;
	int z = 200;
	
	if(x>y && x>z) {
		System.out.println("x is highest");
	}
	else if(y>z) {
		System.out.println("y is highest");
	}
	else {
		System.out.println("z is highest");
	}
	System.out.println("-------------------------------");
	
	String userName = "Abhishek";
	// 2 developer tom and peter
	// 2 QA steve and joe
	
	//for dev
	if(userName == "tom" || userName == "peter") {
		System.out.println("Hii Developer "+ userName);
		System.out.println("How can I help you?");
	}
	// For QA
	else if(userName == "Steve" || userName == "Joe") {
		System.out.println("Hii QA "+ userName);
		System.out.println("How can I help you?");
	}
	// for apart from Dev and QA
	else {
		System.out.println("Hii user "+ userName);
		System.out.println("How can I help you?");
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
