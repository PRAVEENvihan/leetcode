class Solution {
    public boolean canJump(int[] nums) {
       int lgi=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=lgi) lgi=i;
        }
        return lgi==0;
        
    }
}