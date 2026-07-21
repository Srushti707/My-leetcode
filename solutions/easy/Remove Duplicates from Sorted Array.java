// Title: Remove Duplicates from Sorted Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int i=0, j=i+1;
        while(j<nums.length)
        {
            if(nums[i]!=nums[j])
        }
            {
                i++;
            }
    }
                nums[i]=nums[j];
            j++;
        return i+1;
}
