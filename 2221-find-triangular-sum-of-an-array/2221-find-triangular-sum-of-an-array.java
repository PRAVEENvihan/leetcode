class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums) list.add(n);
        while(list.size()>1){
            int len =list.size();
            for(int i =1;i<len;i++){
                list.add((list.get(1)+list.get(0))%10);
                list.remove(0);
            }
            list.remove(0);
            }
        return list.get(0);
    }
}