// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         ArrayList<Integer> res = new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i =0 ;i<nums.length;i++){
//             if(nums[i]==target)
//                 res.add(i);
//         }
//         return res;
//     }
// }

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int lessthan = 0;
        int count=0;
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]==target) count++;
            if(nums[i]<target) lessthan++;
            
        }
        for(int i=0;i<count;i++){
            res.add(lessthan++);
        }
        return res;
    }
}