package Session_8.methods;

import java.util.ArrayList;

public class SystemMethods {
	
	static String welcomeMessage = "     Hello User     ";
	
	public static void main(String args[]) {
	System.out.println("Size of the String is " + welcomeMessage.length());	
		System.out.println(welcomeMessage.trim());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		
	}

}
