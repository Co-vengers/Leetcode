class Solution {
    void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverseRange(int nums[], int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            --i;
        }

        if(i >= 0){
            for(int j = len-1 ; j >= i ; j--){
                if(nums[j] > nums[i]){
                    swap(nums, i, j);
                    break;
                }
            }
        }
        reverseRange(nums, i+1, len-1);
    }
}