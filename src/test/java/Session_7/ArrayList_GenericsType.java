package Session_7;

import java.util.ArrayList;

public class ArrayList_GenericsType {

	public static void main(String[] args) {
	  ArrayList<String> username =	new ArrayList<String>();
	  username.add("Tom");
	  username.add("peter");
	  username.add("Pratz");
	//  username.add(55);     // we have restricted array list to string so it will give errer
	  
	  for(int i=0; i<username.size(); i++) {
		  System.out.println(username.get(i));
	  }
	  
	  System.out.println("--------------------------");
	  
	  ArrayList<Integer> numberList = new ArrayList<Integer>();
	  System.out.println(numberList.size());
	  
	  numberList.add(10);
	  numberList.add(20);
	  numberList.add(30);
	  numberList.add(40);
	  numberList.add(50);
	  System.out.println(numberList.size());
	  System.out.println("-----------------------");
	  for(int i=0; i<numberList.size(); i++) {
		  System.out.println(numberList.get(i));
	  }
	  System.out.println("---------------------------");
	  boolean isAvailable = numberList.contains(360);
	   System.out.println(isAvailable);
	  numberList.clear();
//    System.out.println(numberList.size());
	   System.out.println("---------------------------");
	  System.out.println(numberList.isEmpty());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}

}
