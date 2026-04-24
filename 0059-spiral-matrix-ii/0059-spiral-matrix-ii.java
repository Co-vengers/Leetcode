class Solution {
    public int[][] generateMatrix(int n) {
        int [][] ans = new int[n][n];
        int count = 1;

        int top_row = 0; 
        int bottom_row = n-1; 
        int left_col = 0; 
        int right_col = n-1;

        while(count != (n*n)+1){
            for(int c = left_col ; c <= right_col ; c++){
                ans[top_row][c] = count++;
            }
            top_row++;

            for(int r = top_row ; r <= bottom_row ; r++){
                ans[r][right_col] = count++;
            }
            right_col--;

            for(int c = right_col ; c >= left_col ; c--){
                ans[bottom_row][c] = count++;
            }
            bottom_row--;

            for(int r = bottom_row ; r >= top_row ; r--){
                ans[r][left_col] = count++;
            }
            left_col++;
        }
        return ans;
    }
}