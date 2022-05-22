package Session_8.methods;

public class userDefined_Methods {

	// 1.no input no return
	public void test()
	{
		System.out.println("Test method");
	}
	
	// 2.no input some return
	public String nameOfCountry()
	{
		String countryName = "India";
		return countryName;	
	}
	
	//
	public String[] listOfStudents()
	{
		System.out.println("List of students is - ");
		String names[] = new String[3];
		names[0] = "Harry";
		names[1] = "Peter";
		names[2] = "Prat";
		return names;
	}
	
	// 3.some input some output
	public int add(int a , int b)
	{
		int c = a + b;
		return c;
	}
	
	public String countryCapital(String countryName)
	{
		if(countryName.equals("India"))
		{
			String capital = "New Delhi";
			return capital;
		}
		else if(countryName.equals("USA"))
		{
			String capital = "Washington DC";
			return capital;
		}
		else
		{
			return "No country found";
		}
	}
	
	
	
	public static void main(String args[]) {
		
		userDefined_Methods ref = new userDefined_Methods();
		ref.test();
		System.out.println("My country name is " + ref.nameOfCountry());
		
		
		String listOfStudents[] = ref.listOfStudents();
		System.out.println(listOfStudents[2] + " " + listOfStudents[1] + " " + listOfStudents[0]);
		
		int total = ref.add(10, 20);
		System.out.println("total is - " + total);
		
		String capital = ref.countryCapital("India");
		System.out.println(capital);
				
		
	}
	
	
	
}
