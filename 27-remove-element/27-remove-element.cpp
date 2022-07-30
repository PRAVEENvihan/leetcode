class Solution {
public:
    // vo
    int removeElement(vector<int>& nums, int val) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        // int count=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==val){
        //         count++;
        //     }
        // }
        int j=0,i=0;
        while(i<nums.size()){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
            i++;
        }
        // while(i<nums.size()){
        //     if(nums[i]==val){
        //         nums.erase(nums.begin()+i);
        //         i=-1;
        //     }
        //     i++;
        // }
        return j;
    }
};