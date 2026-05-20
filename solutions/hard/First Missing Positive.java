// Title: First Missing Positive
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/first-missing-positive/

class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length+1 && nums[i]!= nums[correctIndex]) swap(nums,i,
correctIndex);
            else i++;
        }
        for(int j=0; j<nums.length;j++)
        {
            if(j!=nums[j]-1) return j+1;
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int first , int second)
