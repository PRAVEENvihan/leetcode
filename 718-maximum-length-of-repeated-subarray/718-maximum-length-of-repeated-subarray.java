class Solution {
    public int findLength(int[] a1, int[] a2) {
        if(a1.length==0 || a2.length==0) return 0;
        int m = a1.length , n = a2.length;
        int max=0;
        int[][] dp=new int[m+1][n+1];
        for(int i =0;i<=m;i++){
            for(int j =0;j<=n;j++){
                 if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else{
                    if(a1[i - 1] == a2[j - 1]){
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                        max = Math.max(max,dp[i][j]);
                    }
                }
            }
        }
        return max;
    }
        }
        
    
               