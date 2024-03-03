package week1.day2;

public class LearnIfCondition {
	public static void main(String[] args) {
		int number = 0;// input

		// output = Check whether the given input is positive or negative or neutral

		// Only if the input is greater than 0 -> Given input  is positive
		// shortcut to create if block -> type if -> ctrl+space -> Enter

		if (number>0) {// 0 > 0 -> F

			System.out.println("The given input : "+number +" is positive");

		}

		else if(number < 0) { // 0 < 0 -> f 

			System.out.println("The given input : "+number +" is negative");
		}
		
		

		else {
			System.out.println("The given input : "+number +" is neutral");
		}



	}

}
