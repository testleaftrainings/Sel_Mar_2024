package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
//     datatype[] variablename = values
		               //0  1  2  3  4 
		int[] scores = {89,98,90,92,95};
		
		int[] sc = new int[5];
		sc[0] = 23;
		sc[1] = 25;
		sc[2] = 27;
		sc[3] = 20;
		
		
		//to find the length of an array
		int len = scores.length;
		System.out.println("The total length of the array is  : "+len);
		
		//to retrieve a single element from the array
		System.out.println("The single element : "+scores[4]);
		
		
		//to sort an array
		Arrays.sort(scores);
		
		// to print the maximum value 
		System.out.println("The max value : "+scores[len-1]);// scores[5-1]
		
		//to print the minimum value
		System.out.println("The min value  : "+scores[0]);
		
		//to print all the values of an array
		for (int i = len-1; i >=0; i--) {// i=0; 0>=0 ; 1-1
			System.out.println(scores[i]); //scores[0] = 89
		}
	}

}
