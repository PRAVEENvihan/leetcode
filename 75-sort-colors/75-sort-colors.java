class Solution {
    public void sortColors(int[] nums) {
        int o=0;
        int z=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                o++;
                if(nums[i]==0)
                    z++;
                    if(nums[i]==2)
                        t++;
        }
        for(int i=0;i<nums.length;i++){
            if(z==0){
                if(o==0){
                    nums[i]=2;
                    t--;
                }
                else{
                    nums[i]=1;
                    o--;
                }
            }
            else{
                nums[i]=0;
                z--;
            }
        }
        
    }
}