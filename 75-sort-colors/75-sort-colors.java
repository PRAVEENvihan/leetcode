// class Solution {
//     public void sortColors(int[] nums) {
//         int o=0;
//         int z=0;
//         int t=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==1)
//                 o++;
//                 if(nums[i]==0)
//                     z++;
//                     if(nums[i]==2)
//                         t++;
//         }
//         for(int i=0;i<nums.length;i++){
//             if(z==0){
//                 if(o==0){
//                     nums[i]=2;
//                     t--;
//                 }
//                 else{
//                     nums[i]=1;
//                     o--;
//                 }
//             }
//             else{
//                 nums[i]=0;
//                 z--;
//             }
//         }
        
//     }
// }
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int i = 0;  
        int j  = 0; 
        int k = nums.length - 1;  
        while( j <= k){
            
            if(nums[j]>1){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k --;
            }
            else if(nums[j]<1){                
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i ++;
                j ++;
            }
            else{
                j ++;
            }
        }
    }
}