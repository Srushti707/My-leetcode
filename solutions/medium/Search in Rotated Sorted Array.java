// Title: Search in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int pivot=findPivot(nums);
        int end = nums.length-1;

        int ans=binarySearch(nums,target,start,pivot);
        if(ans!=-1)
        {
            return ans;
        }
        else 
        {
            return binarySearch(nums,target,pivot+1,end);
        }


