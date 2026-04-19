// Title: Search in Rotated Sorted Array II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

        return nums.length-1;
            if(nums[i]>nums[i+1]) return i;
        }
        for(int i=0; i<nums.length-1; i++)
        {
    }
    public int pivot(int[] nums)
    {
        if(nums.length==1) return 0;
        {
            return BinarySearch(nums,target,p+1,nums.length-1);
        }
        else return ans;
    public boolean search(int[] nums, int target) {
        int p=pivot(nums);
        boolean ans=BinarySearch(nums,target,0,p);
        if(ans==false)
class Solution {
