class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=String.valueOf(num);
        int count = 0;
        for(int i=0;i<str.length()-k+1;i++){
            String x=str.substring(i,i+k);
            if(Integer.parseInt(x)!=0 && num % Integer.parseInt(x) == 0){
                count++;
            }
                
            
        }
     return count;
    }
}