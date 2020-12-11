package java_pkg;

import java.util.ArrayList;
import java.util.Arrays;
 
public class SumCombinations {
	
	static void sumComb(ArrayList<Integer> inputNumbers, int targetSum, ArrayList<Integer> partialNumbers) {
		
	       int sum = 0;
	      
	       
	       for (int x: partialNumbers) {	 
	    	   
	    	   sum += x;
 
	       }    
	       
	       
	       if (sum == targetSum)
	    	   	
	            System.out.println("("+Arrays.toString(partialNumbers.toArray())+")");
	       
	       
	       if (sum >= targetSum){
 
	    	   return;
	       }	            
	       
	       
	       for(int i=0;i<inputNumbers.size();i++) {	  
  	   
	             ArrayList<Integer> remainingNumbers = new ArrayList<Integer>();
 
	             int n = inputNumbers.get(i);	
            
	             for (int j=i+1; j<inputNumbers.size();j++) {
 
	            	 remainingNumbers.add(inputNumbers.get(j));
	             }
	             
	             ArrayList<Integer> partialNumbersList = new ArrayList<Integer>(partialNumbers);
 
	             partialNumbersList.add(n);
 
	          
	             sumComb(remainingNumbers,targetSum,partialNumbersList);
	       }
 
	    }
	    static void sum_combinations(ArrayList<Integer> inputNumbers, int targetSum) {
 
	    	sumComb(inputNumbers,targetSum,new ArrayList<Integer>());
 
	    }
 
	    public static void main(String args[]) {
 
	        Integer[] inputNumbers = {2,49,1,8,3,45,20,6,7,15,28};
 
	        int targetSum = 50;
	        System.out.println("The Combinations for getting sum of 50 are ");
	        System.out.println("---------------------------------------------");
	        sum_combinations(new ArrayList<Integer>(Arrays.asList(inputNumbers)),targetSum);
 
	    }
 
}
