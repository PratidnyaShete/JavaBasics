package Session_9;

public class StaticAndNonStatic {

	String name;
	static int age = 25;
	
	
	public void getName()
	{
		System.out.println("Get name method");
	}
	public static void getStart() {
		System.out.println("Get Start Method");
	}
	public static void main(String[] args) {
		System.out.println("------------");
		getStart();
		System.out.println(age);
		System.out.println("------------");
		
		StaticAndNonStatic.getStart();
		System.out.println(StaticAndNonStatic.age);
		System.out.println("------------");
		
		StaticAndNonStatic objRef = new StaticAndNonStatic();
		objRef.name = "Tom";
		System.out.println(objRef.name);
		System.out.println("------------");
		
		System.out.println(new StaticAndNonStatic().name = "Sam");
		new StaticAndNonStatic().getName();
		System.out.println("------------");
		
		StaticAndNonStatic objref1 = new StaticAndNonStatic();
		objref1.getName();
		objref1 = null;
		objref1.getName();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
