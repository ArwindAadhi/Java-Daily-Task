package java_pkg;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSubstring { 

	static List<String> arraylist = new ArrayList<String>();
	static int countPS(String str){ 

        String word = ""; 
        StringBuffer stf; 
        
        for (int i = 0; i < str.length(); i++) { 
        	for (int j = i + 1; j <= str.length(); j++) { 

                word = str.substring(i, j); 
                if (word.length() >= 3) {
                  
                    stf = new StringBuffer(word); 
                    stf.reverse();
                    if (stf.toString().compareTo(word) == 0)
                    	arraylist.add(word); 
                	} 
                }
        } 
        
        
        int maxLength = 0;
        String longestString = null;
        for (String s : arraylist) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        
        
        System.out.println("Palindromes in this string are " + arraylist);
        System.out.println("The Longest Palindrome string is " +longestString);
        return arraylist.size();
    }
		
		public static void main(String args[]) throws Exception { 
    	String str = "asddsadsadssassaadsdsadsssadsa"; 
    	System.out.println(countPS(str));
        System.out.println("Total Palindromes are "+ arraylist.size());
        
    }
    
}