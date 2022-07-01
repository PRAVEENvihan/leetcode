class Solution {
    public int longestPalindrome(String s) {
	
	    // PSEUDO_CODE 
       
        // pairs ->  (count/2)
        // result = pairs*2
        // if(count%2==1 and result%2==0) 
        //   result++;
         
        int[] count = new int[128];
        
        int result = 0 ; 
        
        for(char c: s.toCharArray())
        {
            count[c]++;    //O[n]- time O[n] - space 
        }
        
        for(int i=0 ; i<128 ; i++)
        {
            result += (count[i]/2)*2; // length = pair_size*2  
            if(count[i]%2==1 && result%2==0)  // checking if odd letters are there , then increase the final length by 1 
            {
                result++;
            }
        }
        
        return result ;

    }
}
