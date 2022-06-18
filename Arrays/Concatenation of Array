// 1929 Leetcode - EASY
// https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*(nums.length)];
        for(int i=0; i<2*nums.length; i++) {
            arr[i] = nums[i%nums.length];
        }
        return arr;
    }
}
