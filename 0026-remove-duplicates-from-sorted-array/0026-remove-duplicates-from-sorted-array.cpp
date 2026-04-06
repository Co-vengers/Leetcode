class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int l = 1;
        if(nums.size() == 0)return 0;
        for(int r = l ; r < nums.size() ; r++){
            if(nums[r] != nums[r-1]){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
};