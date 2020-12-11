package java_pkg;

import java.util.*;



public class Reccuring {
	
	public static void main (String[] args) 
	{ 
		String str = "Arwind Adithyan"; 
		char[] arr = str.toCharArray(); 
		System.out.println(repeatingChar(arr)); 
	} 

	//Java code for printing the first number that repeats in String
	//Character is initialized in String
	
	static char repeatingChar(char str[])
	{
		//Creating an Empty Hashset for storing string
		HashSet<Character> hs = new HashSet<>();
		
		//Checking the string from left - right for repeated characters
		for ( int i=0; i<=str.length-1; i++) {
			
			char letter = str[i];
			
			//Checking if the element is already in HashSet, if not then return
			if(hs.contains(letter))
				return letter;
			
			//else adding the character to the HashSet
			else hs.add(letter);
		}
		
		return '\0';
		
	}


}
