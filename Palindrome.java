package java_pkg;

import java.util.ArrayList;
import java.util.List;



public class Palindrome{

	
    
	static List<String> arraylist = new ArrayList<String>();
    public static void checkPalindrome(String s){
  
   String reverse = new StringBuffer(s).reverse().toString(); 
	 
     if (s.equals(reverse)) {
     arraylist.add(s);
	System.out.println(s +" is a Palindrome");
    }
     
    else
    {
    System.out.println(s +" is not a Palindrome");
    }
    }
    
    public static String getLongestString(List<String> arraylist2) {
      int maxLength = 0;
      String longestString = null;
      for (String s : arraylist2) {
          if (s.length() > maxLength) {
              maxLength = s.length();
              longestString = s;
          }
      }
      return longestString;
  }
    
    public static void main(String []args)
    {
    Palindrome p = new Palindrome();
    p.checkPalindrome("assdssa");
    p.checkPalindrome("appaa");
    p.checkPalindrome("tenet");
    String longestString = getLongestString(arraylist);
    System.out.println("The Longest Palindrome string is " +longestString);
    System.out.println("Length of the Longest Palindrome "+longestString + " is "+ longestString.length());
    System.out.println("Total number of Palindrome is " + arraylist.size());
    }
    
 }

