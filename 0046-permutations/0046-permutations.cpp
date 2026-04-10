class Solution {
public:
    void compute(vector<int>& ds, vector<vector<int>>& ans, vector<int>& nums, vector<int>& freq){
        if(ds.size() == nums.size()){
            ans.push_back(ds);
        }

        for(int i = 0 ; i < nums.size() ; i++){
            if(!freq[i]){
                ds.push_back(nums[i]);
                freq[i] = 1;
                compute(ds, ans, nums, freq);
                ds.pop_back();
                freq[i] = 0;
            }
        }
    }

    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> ds;
        vector<int> freq(nums.size(), 0);
        compute(ds, ans, nums, freq);
        return ans;
    }
};