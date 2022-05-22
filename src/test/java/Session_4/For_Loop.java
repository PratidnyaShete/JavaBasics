package Session_4;

public class For_Loop {

	public static void main(String[] args) {
		// 1 to 10
		// for(start point; condition; increment/decrement)
		//int i = 1;
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
        System.out.println("--------------------------------");
        // reverse order
        for(int i=10; i>=1; i--) {
        	System.out.println(i);
        }
        System.out.println("--------------------------------");
        
         //Print 0 to 20 even numbers only
      //  for(int even=0; even<=20; even = even+2) {
        //	System.out.println(even);
        //}
        System.out.println("--------------------------------");
        
		for(int j=0; j<=20; j++) {
			if(j % 2 == 0) {
				System.out.println(j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
