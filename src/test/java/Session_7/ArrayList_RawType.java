package Session_7;

import java.util.ArrayList;

public class ArrayList_RawType {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		int arrayListSize = ar.size();
		System.out.println(arrayListSize);
//or	System.out.println(ar.size());
		System.out.println("----------------------------");
		
		ar.add(100);  //   0th index position
		ar.add(200);   //  1st index position
		ar.add("test");  //  2nd index position
		System.out.println(ar.size());
		
		ar.add(300);    // 3rd index psition
		ar.add(400);    // 4th index position
		System.out.println(ar.size());
		System.out.println("----------------------------");
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("----------------------------");
		System.out.println(ar.get(2));   // it will give output that which is available at 2nd index position
		System.out.println("----------------------------");
		
		ar.remove(3); //it will remove 3rd index position
		System.out.println(ar.size());
		System.out.println("----------------------------");
		
		for(int j=0; j<ar.size(); j++) {
			System.out.println(ar.get(j));
		}
		System.out.println("----------------------------");
		
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i).equals("test")) {
				System.out.println("Yes I got \"test\" in the ar arrray list at index position " + i);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
