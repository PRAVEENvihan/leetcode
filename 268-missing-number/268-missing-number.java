// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int temp=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=i){
//                 temp=i;
//                break;
            
//                 }
//         }
//      return temp;
//     }
// }

class Solution {
     public int missingNumber(int[] nums) {
         int sum=0,total=0;
         for(int i=0;i<nums.length;i++){
             sum=sum+nums[i];
             total=total+i;
         }
         total=total+nums.length;
         int missing =total-sum;
         return missing;
     }
}