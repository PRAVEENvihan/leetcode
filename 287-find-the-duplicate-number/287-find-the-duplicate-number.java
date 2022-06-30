class Solution {
    public int findDuplicate(int[] nums) {
     
        int[] counter = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            counter[nums[i]]++;
            
            if(counter[nums[i]] == 2){
                return nums[i];
            }
        }
        
        return 0;
        
    }
}