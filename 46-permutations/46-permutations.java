// class Solution {
    
//     private void recurPermute(int[] nums ,List<Integer> ds, List<List<Integer>> ans, boolean freq[] ){
//         if(ds.size()==nums.length){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         for(int i=0;i<nums.length;i++){
//             if(!freq[i]){
//                 freq[i]=true;
//                 ds.add(nums[i]);
//                 recurPermute(nums,ds,ans,freq);
//                 ds.remove(ds.size()-1);
//                 freq[i]=false;
//             }
//         }
//     }
    
    
    
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans= new ArrayList<>();
//         List<Integer> ds = new ArrayList<>();
//         boolean freq[]=new boolean[nums.length];
//         recurPermute(nums , ds , ans, freq);
//         return ans;
//     }
// }

class Solution {
    
    public void recurPermute(int ind ,  List<List<Integer>> ans , int[] nums){
        if(ind==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind;i<nums.length;i++){
            swap(i,ind,nums);
            recurPermute(ind+1,ans,nums);
            swap(i,ind,nums);
        }
        
    }
    public void swap(int i , int j , int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    
    
 public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans= new ArrayList<>();
     recurPermute(0,ans,nums);
     return ans;
     
 }

}