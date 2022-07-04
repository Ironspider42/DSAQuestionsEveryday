https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
1365. Leetcode - EASY

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        for(int i:nums){
            count[i]++;
        }
        for(int i=1; i<101; i++){
            count[i]+=count[i-1];
        }
        for(int i = 0;i < nums.length; i++){
            int position = nums[i];
            if(position == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = count[nums[i] -1];
            }
        }
        return nums;
    }
}
