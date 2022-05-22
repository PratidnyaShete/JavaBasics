package Session_6;

public class String_Manupulations {

	public static void main(String[] args) {
		
		String str1 = "Hello everyone lets learn something about string";
		int lengthOfStr1 = str1.length();
		System.out.println("Length of string is " + lengthOfStr1);
		//or
		System.out.println("Length of string is " + str1.length());
		System.out.println("--------------------------------------------------");
		
		String str2 = "I am learning srting in Java";
		System.out.println("Character at 2nd index position is " + str2.charAt(2));
		System.out.println("Length of strint str2 is " + str2.length());
//		System.out.println("Character at 48 index position is "+str2.charAt(48)); //StringIndexOutofBoundException
		System.out.println("--------------------------------------------------");
		
		String str3 = "Hello there";
		System.out.println("Length of String is "+ str3.length());
		System.out.println("Index position of char e in string str3 is "+ str3.indexOf('e'));
		System.out.println("Index position of char e at 2nd occurance is "+ str3.indexOf('e', 2));
		System.out.println("Index position of char e at 2nd occurance is "+ str3.indexOf('e', str3.indexOf('e')+1));
		System.out.println("--------------------------------------------------");
		
		String str4 = "Github is acquired by microsoft in year 2018";
		System.out.println("Index position for word year in string str4 is "+ str4.indexOf("year"));
		System.out.println("Index position for word Apple in string str4 is "+ str4.indexOf("Apple"));
		System.out.println("--------------------------------------------------");
		
		//convert to upper case
		String str5 = "Selenium is used to automate web applications";
		System.out.println(str5.toUpperCase());
		//convert to lower case
		String str6 = "SELENIUM IS USED TO AUTOMATE WEB APPLICATIONS";
		System.out.println(str6.toLowerCase());
		System.out.println("--------------------------------------------------");
		
		//remove blank spaces / remove white spaces
		String str7 = "         Selenium is a free automation tool     ";
		System.out.println("After removing white spaces from \"str7\" output is : " + str7.trim());
		System.out.println("--------------------------------------------------");
		
		//Replace character
		String str8 = "16/02/1996";  //replace / with :
		System.out.println(str8.replace('/', ':'));
		System.out.println(str8.replace('/', '#'));
		
		String str9 = "Hello there I am looking for your reply";
		System.out.println(str9.replace("Hello", "Hiii"));
		System.out.println("--------------------------------------------------");
		
		//check whether particular word is available in string
		String str10 = "Selenium can handle html code";
		System.out.println("is Selenium word available in string :" + str10.contains("Selenium"));
		System.out.println("is c word available in string :" + str10.contains("c"));
		System.out.println("--------------------------------------------------");
		
		String str11 = "The transaction number is - 78E625P323 Thank you";
		System.out.println("The transaction no. is : " + str11.substring(27));
		System.out.println("The transaction no. is : "+ str11.substring(27, 36));
		System.out.println("--------------------------------------------------");
		
		String statement1 = "Java is platform independent";
		String statement2 = "java is platform independent";
		String statement3 = "Java is platform independent";
		System.out.println(statement1.equals(statement2));
		System.out.println(statement1.equals(statement3));
		System.out.println(statement1.equalsIgnoreCase(statement2));
		System.out.println("--------------------------------------------------");
		
		//convert each word to seperate line
		String str13 = "Java is based on object oriented principles";
		String[] words = str13.split(" ");
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println("--------------------------------------------------");
		
		String str14 = "Good bye";
		String[] revword = str14.split(" ");
		System.out.println(revword[1] + " " + revword[0]);
		
		
		
		
		
		
		

	}

}
