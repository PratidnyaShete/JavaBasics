package Session_4;

public class While_Loop {
	public static void main(String args[]) {
		
		// 1 to 5
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println("------------------");
		System.out.print(1 + " ");
		System.out.print(2 + " ");
		System.out.print(3 + " ");
		System.out.print(4 + " ");
		System.out.print(5 + " ");
		System.out.println("------------------");
		
		// Print from 1 to 10 by using while loop
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
			//++i;
		}
		System.out.println("------------------");
		
		int j = 1;  // start point
		while(j<=10) {  //condition
			System.out.println(j);
			if(j == 9) {
				System.out.println("Hey this is nine");
				break;
			}
			j++; //increment
		}
		System.out.println("------------------");
		boolean isCashReceived = true;
		int amount = 230;
		while(isCashReceived) {
			System.out.println("Bill paid successfully " + amount);
			System.out.println("Thank You");
			isCashReceived = false;
			//break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
