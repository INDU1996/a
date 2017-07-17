package indu;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
	public static void main(String[] args) {        

	    int []a = {2,45,7,3,5,1,8,9};
	    printSumPairs(a,10);        

	}


	public static void printSumPairs(int []input, int k){
	    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

	    for(int i=0;i<input.length;i++){

	        if(pairs.containsKey(input[i]))
	            System.out.println(input[i] +", "+ pairs.get(input[i]));
	        else
	            pairs.put(k-input[i], input[i]);
	    }

	}
	}
	