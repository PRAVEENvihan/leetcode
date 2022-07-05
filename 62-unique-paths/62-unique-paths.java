// class Solution {
//     public int uniquePaths(int m, int n) {
// 		// base case
//         if(m == 1 || n == 1) return 1;
        
// 		// move down
//         int downMove = uniquePaths(m-1, n);
// 		// move right
//         int rightMove = uniquePaths(m, n-1);
        
//         return downMove + rightMove;
//     }
// }






// class Solution {
//     public int uniquePaths(int m, int n) {
// 		int[][] dp=new int[m][n];
//         for(int i = 0 ; i<m;i++){
//             for(int j = 0 ; j < n ; j++){
//                 if(i==0 || j==0) dp[i][j]=1;
//                 else dp[i][j]=dp[i-1][j]+dp[i][j-1];
//             }
//         }
//         return dp[m-1][n-1];
//     }
// }



public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m < n) {              // Swap, so that m is the bigger number
            m = m + n;
            n = m - n;
            m = m - n;
        }
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++, j++){       // Instead of taking factorial, keep on multiply & divide
            res *= i;
            res /= j;
        }
            
        return (int)res;
    }
}