package Session_8;

public class WebPage {
	//Data members of class
	//Variables
	String title = "Welcome to BestGoods";
	String url = "https://www.bestgoods.com";
	String header = "bestgoods.com : Online shopping - Mobiles, Laptops, books etc.";
	String logoimage = "https://www.bestgoods.com/images/logo";
	
	//Methods
	
	//Non Static Methods
	public void toppannel()
	{
		//Logic
		System.out.println("--------- Top Pannel Start ---------");
		System.out.println(url);
		System.out.println("This is top pannel of the webpage");
		System.out.println(title);
		System.out.println(logoimage);
		System.out.println("--------- Top Pannel End ---------");
	}
	
	public void footerlinks()
	{
		System.out.println("--------- Footerlink Start ---------");
		System.out.println("Footerlink url 1");
		System.out.println("Footerlink url 2");
		System.out.println("Footerlink url 3");
		System.out.println("Footerlink url 4");
		System.out.println("--------- Footerlink End ---------");
	}
	
	public void centrepannel()
	{
		System.out.println("--------- CentrePannel Start ---------");
		System.out.println("Mobiles");
		System.out.println("Laptops");
		System.out.println("Cameras");
		System.out.println("Books");
		System.out.println("--------- Centrepannel End ---------");	
	}
	
	//Static methods
	public static void privacypolicy()
	{
		//logic
		System.out.println("--------- Privacy Policy Start ---------");
		System.out.println("About business of BestGoods");
		System.out.println("Vendors of BestGoods");
		System.out.println("Privacy Notice");
		System.out.println("--------- Privacy Policy End ---------");		
	}
	
	public static void main(String[] args)
	{
		WebPage objRef = new WebPage();
		objRef.toppannel();
		objRef.centrepannel();
		objRef.footerlinks();
		System.out.println("This is url for application " + objRef.url);
		
		privacypolicy();  // there is no need to create object for static methods
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
