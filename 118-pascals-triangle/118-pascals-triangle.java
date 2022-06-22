class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>(0);
        List<List<Integer>> resultList = new ArrayList<>(numRows);
        int n = 0;
        while (n < numRows) {
            List<Integer> tempResult = new ArrayList<>(n);
            int prev = 1;
            tempResult.add(prev);
            for (int j = 1; j <= n; j++) {
                int current = (prev * (n - j + 1)) / j;
                prev = current;
                tempResult.add(current);
            }
            resultList.add(tempResult);
            n++;
        }
        return resultList;
    }
}