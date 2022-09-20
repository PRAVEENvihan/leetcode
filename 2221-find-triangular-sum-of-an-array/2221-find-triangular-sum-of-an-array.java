class Solution {
    // public int triangularSum(int[] nums) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(int n : nums) list.add(n);
    //     while(list.size()>1){
    //         int len =list.size();
    //         for(int i =1;i<len;i++){
    //             list.add((list.get(1)+list.get(0))%10);
    //             list.remove(0);
    //         }
    //         list.remove(0);
    //         }
    //     return list.get(0);
    // }
    public int triangularSum(int[] nums) {
        for (int n = nums.length; n > 0; --n) {
            for (int i = 1; i < n; ++i) {
                nums[i - 1] += nums[i];
                nums[i - 1] %= 10;
            }
        }
        return nums[0];
    }
}