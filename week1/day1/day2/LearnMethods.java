package week1.day2;

public class LearnMethods {
	// shortcut to create a method -> type method name -> ctrl+space -> click enter
	
	public int noOfbicycles() {
		
		return 2;

	}
	
	public String bicycleData(String brandName,String brandColor) {
	    return brandName +" " + brandColor;

	}
	
	 boolean isJavaPlatformIndependent() {
		
		return true;

	}
	
	private void addTwoNumbers(int num1, int num2) {
		System.out.println(num1+num2);
		
	}
	 public static void main(String[] args) {
		 // Classname objectname = new Classname();
		 LearnMethods lm = new LearnMethods();
		 lm.addTwoNumbers(23, 25);
		 
		boolean result = lm.isJavaPlatformIndependent();
		System.out.println(result);
		
		String data= lm.bicycleData("Honda", "Red");
		System.out.println(data);
		
	}
	

}
