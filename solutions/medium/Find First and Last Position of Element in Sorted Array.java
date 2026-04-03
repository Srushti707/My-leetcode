// Title: Find First and Last Position of Element in Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    static public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
        
    }

    static int search(int[] nums, int target ,boolean searchStartIndex) 
    {
        int start =0;
        int end=nums.length-1;
        int ans=-1 ;

        while (start<=end) 
            {
