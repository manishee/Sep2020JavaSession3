package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		String str="Hello This is my first java code and I am so happy";
		//String is a collection of multiple characters
		//String is maintaining these characters in a character array
		
		System.out.println(str.length());//44
		System.out.println("Li " + 0);
		System.out.println("Hi " + (str.length()-1));
		
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("i"));// 1st occurence of i
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
	
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("manish"));// 
		
		System.out.println("--> " +str.charAt(5));
		System.out.println(str.charAt(0));
		System.out.println(str.length());//50
		System.out.println(str.charAt(49));
		
		//System.out.println(str.charAt(50));//StringIndexOutOfBoundsException
		
		String messg="welcome admin";
		if(messg.indexOf("admin")>0) {
			System.out.println("correct welcome message");
		}else {
			System.out.println("incorrect welcome message");
		}
		
		String s="   hello world    ";
		System.out.println(s);
		//trim
		System.out.println(s.trim());//trim will remove spaces from corners
		
		//replace
		System.out.println(s.trim().replace(" ", ""));
		
		String dob="01-01-1990";
		System.out.println(dob.replace("-", "/"));
		//upper case
		String s1="this is my java code";
		System.out.println(s1.toUpperCase());
		
		//lower case
		String s2="HELLO WELCOME TO TESTING";
		System.out.println(s2.toLowerCase());
		
		//contains
		String s3="Your browser is chrome";
		System.out.println(s3.contains("chrome"));
		
		String browser="chrome";
		if(browser.contains("chrome")) {
			System.out.println("launch chrome browser");
			
		//equals
		String f1="Hello World";
		String f2="hello World ";
		
		System.out.println(f1.equals(f2));
		System.out.println(f1.equalsIgnoreCase(f2));
		System.out.println(f1.equalsIgnoreCase(f2.trim()));
		
		System.out.println(f1+f2);
		System.out.println(f1.concat(f2));
		
		//split:
		String lang="Java;Python;JavaScript;Ruby";
		String language[] = lang.split(";");
		
		System.out.println(language.length);
		System.out.println(language[3]);
		
		//for each loop
		for(String ele : language) {
			System.out.println(ele);
		}
		System.out.println("------");
		for (int i=0; i<language.length; i++) {
			System.out.println(language[i]);
		}
		System.out.println("-------");
		String empData="Neha;Kashyap;25;London;UK;98900;IBM";
		String emp[]=empData.split(";");
		for (String data : emp) {
			System.out.println(data);
		}
		System.out.println("----");
		String main="Your total amount is 3000";
		System.out.println(main.substring(5));
		System.out.println(main.substring(5, 12));//last range -1
		System.out.println(main.substring(main.indexOf("is")+3, main.length()));
		System.out.println(main.substring(main.indexOf("is")+3));
		
		String amount =main.substring(main.indexOf("is")+3, main.length());
		System.out.println(amount+50+10);
		System.out.println(amount+(50+10));
		
		//String to int: using ParseInt from Integer class;
		int amountval=Integer.parseInt(amount);
		System.out.println(amountval+50+10);
		
		}
		
	}

}
