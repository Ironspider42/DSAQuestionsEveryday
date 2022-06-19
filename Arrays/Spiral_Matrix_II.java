// 59. Leetcode - Medium
// https://leetcode.com/problems/spiral-matrix-ii/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n]; 
        int top = 0; int down = n-1;
        int left = 0; int right = n-1;
        int direction = 0; int c = 1;
        while(top <= down && left <= right && c<=n*n) {
             {
                for(int i=left; i<=right; i++) {
                    ans[top][i] = c;
                    c++;
                }
                top++;
            }
             {
                for(int i=top; i<=down; i++) {
                    ans[i][right] = c;
                    c++;
                }
                right--;
            }
            {
                for(int i=right; i>=left; i--) {
                    ans[down][i] = c;
                    c++;
                }
                down--;
            }
             {
                for(int i=down; i>=top; i--) {
                    ans[i][left] = c;
                    c++;
                }
                left++;
            }
            // direction = (direction+1) % 4;
        }
        return ans;
    }
}
