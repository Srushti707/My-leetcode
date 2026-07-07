// Title: Subsets
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        subset(nums,new ArrayList<>(),ans,0);
        return ans;
    }

    static void subset(int[] nums,List<Integer>list, List<List<Integer>> ans, int i )
    {
        if(i>=nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        //pick
        list.add(nums[i]);
        subset(nums,list,ans,i+1);
        list.remove(list.size()-1);
        //not pick
