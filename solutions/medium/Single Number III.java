// Title: Single Number III
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/single-number-iii/

        for(int num: nums)
        {
            if((num&right)==right) b1=b1^num;
            else b2=b2^num;
        }
        int [] ans= new int[2];
        int b1=0;
        int right= xor^(xor&(xor-1));
        int b2=0;
        ans[0]=b1;
        }
             xor^=num;
        {
        for(int num: nums)
        int xor=0;
    public int[] singleNumber(int[] nums) {
class Solution {
