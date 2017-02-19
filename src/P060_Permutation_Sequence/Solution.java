package P060_Permutation_Sequence;

import java.util.ArrayList;

public class Solution {
    public String getPermutation(int n, int k) {
        String res = "";
        int fact = 1;
        k--;
        for (int i = 1; i < n; ++i) fact *= i; 
        
      	ArrayList<Character> numList = new ArrayList<Character>();
      	for (int i = 0; i < n; i++){
      		numList.add((char)(49+i));
      	}
      	
      	for (int i = 0; i<n ; i++){
      		 
      		res += numList.get(k/fact);
      		numList.remove(k/fact);
      		k = k % fact;
      		if (n-1-i!=0){
      			fact = fact/(n-1-i);
      		}
      	}
      	
        return res;
    }
}
