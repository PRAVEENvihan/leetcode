class Solution {
    
    public void findSubset(int ind , int[] nums , List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i = ind; i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1])
                continue;
            ds.add(nums[i]);
            findSubset(i+1,nums,ds,ans);
            ds.remove(ds.size()-1);
            
        }
    }
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        findSubset(0 , nums , new ArrayList<>(), ans);
        return ans;
    }
}
// class Solution {
// public void traverse(List<List<Integer>> resultList, List<Integer> currentList, int index, int[] nums) {
//     resultList.add(new ArrayList<Integer>(currentList)); // 3. add currentList to final result list
//     for(int i = index; i < nums.length; i++) {
//         if( i > index && nums[i] == nums[i - 1] ) // 2. duplicate removal
//             continue;
//         currentList.add(nums[i]);
//         traverse(resultList, currentList, i + 1, nums);
//         currentList.remove(currentList.size() - 1);
//     }
// }

// public List<List<Integer>> subsetsWithDup(int[] nums) {
//     Arrays.sort(nums); // 1. sort the array
//     List<List<Integer>> resultList = new ArrayList<List<Integer>>();
//     traverse(resultList, new ArrayList<Integer>(), 0, nums);
//     return resultList;
// }
// }