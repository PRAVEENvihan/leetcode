// class Solution {
//     public int climbStairs(int n) {
//         int[] dp = new int[n+1];
//         dp[0]=1;
//         dp[1]=1;
     
//         for(int i = 2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//     }
// }

class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
    }
}