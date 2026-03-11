// Title: Search Insert Position
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums ,target);
        
    }

    public int binarySearch(int[] nums , int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
