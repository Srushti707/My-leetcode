// Title: Remove Element
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        int count=nums.length;
        int j=0;
      for(int i=0; i<nums.length-j; i++)
      {
        if(nums[i]==val)
        {
            shift(nums,i);
            count--;
            i--;
            j++;
        }
      }
      return count;
}
      public void shift(int[] nums, int start )
      {
        for(int i=start; i<nums.length-1; i++)
        {
