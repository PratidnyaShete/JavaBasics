package Session_5;

public class ArraysInJava {
public static void main(String[] args)  {
	
//	 int a = 10;
//	 int i = 20;
//	int j = 30;
//	int k = 40;
//	int l = 50;
//	System.out.println(a + " " + i + " " + j + " " + k + " " + l);
	
	//Declaring array
	int[] a = new int[6];
//OR	int x[] = new int[5];
//OR	int []y = new int[3];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
	a[5] = 60;
	System.out.println(a[0] + a[2]);
	System.out.println("Array is having capacity of " + a.length);
	//for loop of araay
//	for(int i=0; i<=5; i++) {
    for(int i=0; i<=a.length-1; i++) {
		System.out.println(a[i]);
	}
	System.out.println("---------------------------");
	
	int []b = new int[3];
	System.out.println(b[0] +" " + b[1]+ " " + b[2]);
	System.out.println("---------------------------");
	
	int[] c = {10,20,30};
	System.out.println(c[0] + " " + c[1] + " " + c[2]);
//	System.out.println(c[5]); //It will give arrayIndexOutOfBound error because 5th index position is not initialised
	System.out.println("---------------------------");
	
	String []browser = new String[4];
	browser[0] = "chrome";
	browser[1] = "opera";
	browser[2] = "firefox";
	browser[3] = "ie";
	for(int row=0; row<=browser.length-1; row++) {
//		System.out.println(browser[row]);
		if(browser[row].equals("safari"))  {
			System.out.println("Chromr browser got invoked");
		}
		else {
			System.out.println("Please enter valid browser name for windows OS");
			break;
		}
	}
	System.out.println("----------------------");
	//String- name, int- age, float- salary, boolean- Resident of india char- gender, boolean- having a machine
	Object[] emp = new Object[6];
	emp[0] = "Sam";
	emp[1] = 27;
	emp[2] = 49999.56;
	emp[3] = true;		
	emp[4] = 'F';
	emp[5] = true;
	for(int i=0; i<=emp.length-1; i++) {
		System.out.println(emp[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
