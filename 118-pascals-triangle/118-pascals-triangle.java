// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         if (numRows == 0) return new ArrayList<>(0);
//         List<List<Integer>> resultList = new ArrayList<>(numRows);
//         int n = 0;
//         while (n < numRows) {
//             List<Integer> tempResult = new ArrayList<>(n);
//             int prev = 1;
//             tempResult.add(prev);
//             for (int j = 1; j <= n; j++) {
//                 int current = (prev * (n - j + 1)) / j;
//                 prev = current;
//                 tempResult.add(current);
//             }
//             resultList.add(tempResult);
//             n++;
//         }
//         return resultList;
//     }
// }
           
class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=null;
        for(int i=0;i<numRows;i++){
            list=new ArrayList<>();
            int start=0;
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list.add(1);
                    continue;
                }list.add(result.get(i-1).get(start)+result.get(i-1).get(start+1));
                start++;
            }
            result.add(list);
        }
        return result;
    }
}