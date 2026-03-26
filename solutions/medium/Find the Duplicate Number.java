// Title: Find the Duplicate Number
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-duplicate-number/

        for(int j=0; j<nums.length; j++)
        {
            if(j!= nums[j]-1) return nums[j];
        }
        return -1;
    }
    public void swap(int[] nums, int first, int second)
    {
        }
            else i++;
            if(nums[i]!=nums[correctIndex]) swap(nums,i,correctIndex);
            int correctIndex=nums[i]-1;
        {
        while(i<nums.length)
        int i=0;
    public int findDuplicate(int[] nums) {
class Solution {
