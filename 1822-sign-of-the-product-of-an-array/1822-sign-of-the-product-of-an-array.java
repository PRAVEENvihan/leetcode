class Solution {
    public int arraySign(int[] nums) {
        int mul=1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){ return 0;
                          }
            if(nums[i]>0){
                nums[i]=1;
                mul=mul*nums[i];
            }else{nums[i]=-1;
                  mul=mul*nums[i];
                 }
        }
        return mul;
        
    }
}