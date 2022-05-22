package Session_2;

public class StringAndCharConcatenation {
  public static void main(String args[]) {  // Shortcut- main+ctrl+space
	
	  String x = "test";
	  String y = "selenium";
	  
	  String c = "100";
	  String d = "200";
	  
	  int a = 100;
	  int b = 200;
	  System.out.println("-----------------------------");
	  System.out.println(a+b);  //300
	  System.out.println("-----------------------------");
	  System.out.println(x+y);  // testselenium
	  System.out.println("-----------------------------");
	System.out.println(a+b+x);  // 300test
	System.out.println("-----------------------------");
	System.out.println(a+b+x+y);     //300testselenium
	System.out.println("-----------------------------");
	System.out.println(x+y+a);       //testselenium100
	System.out.println("-----------------------------");
	System.out.println(x+y+a+b);     //testselenium100200
	System.out.println(x+y+(a+b));
	System.out.println("-----------------------------");
	System.out.println(c+d);       //100200
	System.out.println("-----------------------------");
	
	int bill = 520;
	int tax = 30;
	//int total = bill+tax;
	//System.out.println("The food bill is : "+total);
	System.out.println("-----------------------------");
	System.out.println("The food bill is :"+ bill +tax);
	System.out.println("The food bill is :"+ (bill +tax));
	System.out.println("-----------------------------");
	
	
	// Character concatination
	char c1 = '5'; int z1 = 5;
	char c2 = '4'; int z2 = 4;
	char c3 = 'A'; String q1 = "A"; 
	char c4 = 'B'; String q2 = "B";
	System.out.println(c1+c2);  // addition of ASCII values 105
	System.out.println("-----------------------------");
	System.out.println(c3+c4);
	System.out.println("-----------------------------");
	System.out.println(q1+q2);
	System.out.println("-----------------------------");
	System.out.println(z1+z2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
