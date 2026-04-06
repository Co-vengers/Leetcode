class Solution {
public:
    bool check(vector<int>& nums) {
        int bp = 0;

        for(int i = 1 ; i < nums.size() ; i++){
            if(nums[i] < nums[i-1]){
                bp++;
            }
        }
        if(bp == 0){
            return true;
        }
        else if(bp <= 1 && nums[nums.size() - 1] <= nums[0]){
            return true;
        }
        return false;
    }
};