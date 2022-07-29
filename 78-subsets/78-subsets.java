class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(nums , 0 , new ArrayList<Integer>() , ans );
        return ans;
    }
    
    void helper(int[] nums , int i , ArrayList<Integer> list , List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }
        helper(nums,i+1 , new ArrayList<>(list) , ans);
        list.add(nums[i]);
        helper(nums , i+1 , list , ans);
    }
}