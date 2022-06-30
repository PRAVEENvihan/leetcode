// class Solution {
//     public int findDuplicate(int[] nums) {
     
//         int[] counter = new int[nums.length];
        
//         for(int i = 0; i < nums.length; i++){
//             counter[nums[i]]++;
            
//             if(counter[nums[i]] == 2){
//                 return nums[i];
//             }
//         }
        
//         return 0;
        
//     }
// }
// class Solution{
//     public int findDuplicate(int nums[]){
//         int slow=nums[0];
//         int fast=nums[0];
//         do{
//             slow=nums[slow];
//             fast=nums[nums[fast]];
//         }while(slow!=fast);
//         fast=nums[0];
//         while(slow!=fast){
//             slow=nums[slow];
//             fast=nums[fast];
//         }
//         return slow;
//     }
// }
class Solution {
    public int findDuplicate(int[] nums) {        
        boolean[] arr = new boolean[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(arr[nums[i]]) return nums[i];
            arr[nums[i]] = true;
        }
        return 0;
        
    }
}