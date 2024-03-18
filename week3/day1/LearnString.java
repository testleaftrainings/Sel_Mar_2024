package week3.day1;

public class LearnString {
	public static void main(String[] args) {
		
	
	
	// Declaration - String literal
	String str = "TestLeaf";
	str=str.toUpperCase();// TESTLEAF
	String str2 = "Testleaf";
	
	// String instantiation
	String str1 = new String("TestLeaf");
	
	// String methods
	// to count the number of characters in a particular string
	int len = str.length();
	System.out.println("The total no: of characters : "+ len);
	
	// to compare two Strings
	if (str.equalsIgnoreCase(str2)) {
		System.out.println("Both are equal");
	}
	else {
		System.out.println("Not equal");
	}
	
	// contains()
	if (str.contains("leaf")) {
		System.out.println("Present");
	}else {
		System.out.println("Not Present");
	}
	
	//toCharArray-Converts this string to a new character array.
	char[] ch = str.toCharArray();
	System.out.println(ch[2]);
	
	//to print all the characters
	for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
	
	
	}	
	

}
