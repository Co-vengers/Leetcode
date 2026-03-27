class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        sort(intervals.begin(), intervals.end());

        for(auto& interval : intervals){
            if(res.empty()){
                res.push_back(interval);
            }
            else if(interval[0] <= res.back()[1]){
                res.back()[1] = max(res.back()[1], interval[1]);
            }
            else{
                res.push_back(interval);
            }
        }
        return res;
    }
};