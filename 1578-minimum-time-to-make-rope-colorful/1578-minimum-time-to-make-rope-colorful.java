class Solution {
    public int minCost(String s, int[] cost) {
        int res = 0;
        for(int i=1; i<s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                res += Math.min(cost[i], cost[i-1]);
                cost[i] = Math.max(cost[i], cost[i-1]);
            }
        }
        return res;
    }
}