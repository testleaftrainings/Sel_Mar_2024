package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	
	public static void main(String[] args) {
		
		// Declare List
		List<String> mentors = new ArrayList<>();
		List<String> list = new ArrayList<>();
		list.addAll(mentors);
		
		
		// to add items into the list
		mentors.add("Aravind");
		mentors.add("Raghu");
		mentors.add("Vinoth");
		mentors.add("Gokul");
		mentors.add(2, "Vineeth");
		
		//to find the size of the list
		System.out.println(mentors.size());
		
		// to retrieve a particular item from a list
		String value = mentors.get(3);
		System.out.println(value);
		
		// to remove an element from the list
		mentors.remove(1);
		System.out.println(mentors.size());
		
		// to sort a list
		Collections.sort(mentors);
		
		//to clear all items from the list
		mentors.clear();
		
		System.out.println(mentors);
		System.out.println(mentors.isEmpty());
		
	}

}
