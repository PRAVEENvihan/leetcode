class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int ans[]=new int[s.length()];
        for(int i = 0 ; i< s.length();i++){
            ans[i]=helper(s.substring(i),n , startPos);
            // System.out.println(s.substring(i));
        }
        return ans;
        
        
    }
    public int helper(String s , int n , int[] startPos ){
        int r=startPos[0];
        int c=startPos[1];
        int ans= 0 ;
        for(int i = 0 ; i< s.length();i++){
           if(s.charAt(i)=='R'){
               c++;
           }else if(s.charAt(i)=='D') r++;
            else if(s.charAt(i)=='L') c--;
            else r--;
            if(r>=n || c>=n|| r<0 || c<0) return ans;
            else ans++;
        }
        return ans;
        
    }
}