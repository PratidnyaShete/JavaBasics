package Session_7;

import java.util.ArrayList;

public class ArrayList_ObjectTypeGenerics {
	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(100);  //   0th index position
		ar.add(200);   //  1st index position
		ar.add("test");  //  2nd index position
		ar.add(true);     // 3rd
		ar.add(22.53);
		ar.add('I');
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
