class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        
        for(int i =0;i<nums.length-2;i++){
            int a= i+1;
            int b=nums.length-1;
            
            while(a<b){
                int curSum=nums[i]+nums[a]+nums[b];
                if(curSum>target){
                    b-=1;
                }else{a+=1;}
                
                if(Math.abs(curSum-target)<Math.abs(res-target)) res=curSum;
            }
        }
        return res;
    }
}