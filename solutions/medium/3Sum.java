// Title: 3Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++)
        {
            if(i>0 && nums[i-1]==nums[i]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(k>j)
            {
                if(nums[i]+nums[j]+nums[k]==0) 
                {
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
