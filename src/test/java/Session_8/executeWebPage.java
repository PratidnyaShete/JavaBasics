package Session_8;

public class executeWebPage {
 public static void main(String args[]) {
	 
	 WebPage xc = new WebPage();
	 xc.toppannel();
	 xc.footerlinks();
	 System.out.println("Logo of the webPage is " + xc.logoimage);
	 WebPage.privacypolicy();      //for static method use class name instead of object name while calling into different class

 
 
 
 }
}
