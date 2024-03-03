package week1.day2;

public class LearnBreakStatement {
	
	public static void main(String[] args) {
		
       // print numbers from  1 to 10 -> print 3 in words and break the iteration
		
		for (int i = 1; i <=10; i++) {// i=3; 3<=10 -> t ; 1++
			
			if(i==3) { // 3==3 -> t
				System.out.println("Three"); 
				break;
				
			}
	
			System.out.println(i); // 1 2 Three 3 4 5 6 7 8 9 10
			
		}
		
		System.out.println("Out of for loop");
	}

}
