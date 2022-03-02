class Solution {
    public int[] searchRange(int[] a, int k) {
        int s = 0 ;
        int l = a.length-1;
        int res1= -1 ;
        int res2 = -1 ; 
        while(s<=l){
            
            int m = s + (l-s)/2;
            if(k==a[m]){
                res1 = m;
                l = m-1;
            }
            else if(k<a[m]){
                l = m-1;
                
            }else{
                s=m+1;
            }
        }
         s = 0 ;
        l = a.length-1;
        while(s<=l){
            
            int m = s + (l-s)/2;
            if(k==a[m]){
                res2 = m;
                s = m+1;
            }
            else if(k<a[m]){
                l = m-1;
                
            }else{
                s=m+1;
            }
        }
        return new int[]{res1 , res2};
        
    }
}