class Solution {
    public int search(int[] a, int k) {
         int n=a.length;
        int l=0;
		    int h=n-1;
		    while(l<=h){
		        int m=l+((h-l)/2);
		        if(a[m]==k){
		            return m;
		        }
            if(a[m]>=a[l]){
		            if(a[m]>=k&&a[l]<=k)
		            {
		            h=m-1;
		            }
		            else
		            l=m+1;
		        }
		        else {
		            if(k>=a[m]&& k<=a[h])
		                l=m+1;
		          else{
		                    h=m-1;;  
		                }
		        }
            }
        return -1;
    }
}