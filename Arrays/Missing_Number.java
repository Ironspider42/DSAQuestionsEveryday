// 268. Leetcode - EASY
//https://leetcode.com/problems/missing-number/
//Important Question

class Solution {
    public int missingNumber(int[] nums) {
       int i = 0;
        while(i<nums.length) {
            if(nums[i] < nums.length && nums[i] != i) {
                int temp2 = nums[i];
                int temp = nums[i]; 
                nums[i] = nums[temp2];
                nums[temp2] = temp;
            }
            else {
                i++;
            }
        }
        for(int j=0; j<nums.length; j++) {
            if(j!=nums[j]){
               return j;
            }
        }
        return nums.length;
    }
}
