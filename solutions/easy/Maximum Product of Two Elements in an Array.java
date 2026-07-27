// Title: Maximum Product of Two Elements in an Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int num:nums)
        {
            if(num>max1)
        }
        return (max1-1)*(max2-1);
            {
                max2=max1;
            }
                max1=num;
            else if(num>max2)
            {
                max2=num;
            }
    }
}
