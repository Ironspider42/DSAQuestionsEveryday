// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
448. Leetcode - EASY
// Asked in Google

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(); 
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }
        }
        for(int index=0; index<nums.length; index++){
            if(index+1 != nums[index]) {
                list.add(index+1);
            }
        }
        return list;
    }
    public void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
