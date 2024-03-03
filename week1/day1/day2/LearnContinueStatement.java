package week1.day2;

public class LearnContinueStatement {
	
	public static void main(String[] args) {
		
       // 1 2 Three 4 5 6 7 8 9 10
		
		for (int i = 1; i <=10; i++) { 
		    if(i==3) { //4==3
		    	System.out.println("Three"); // Three
		    	continue;
		    }
		
			System.out.println(i);//1 2 Three
		}
}}
