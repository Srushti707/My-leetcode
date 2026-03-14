// Title: Find Minimum in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            System.out.println(nums[mid]);
            if(nums[mid]>nums[end]) start=mid+1;

        }
        return nums[start];
    }
            else end=mid;
}
