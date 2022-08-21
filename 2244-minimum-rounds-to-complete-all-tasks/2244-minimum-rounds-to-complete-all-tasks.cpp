class Solution {
public:
    int minimumRounds(vector<int>& t) {
        unordered_map<int,int> mp;
        for(int i=0;i<t.size();i++){
            mp[t[i]]++;
        }
        int ans=0;
        for(auto i:mp){
            if(i.second<2) return -1;
           
            else if (i.second%3==0) ans+= i.second/3;
            else {
                ans+= i.second/3+1;
            }
        }
        return ans;
    }
};