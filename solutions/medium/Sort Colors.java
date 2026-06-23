// Title: Sort Colors
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1; i++)
        {
            for(int j=nums.length-1; j>i; j--)
            {
                if(nums[j]<nums[i])
                {
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
    }
}
