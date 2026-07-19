// Title: Subsets II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subsets-ii/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans= new HashSet<>();
        Arrays.sort(nums);
        subset(nums,new ArrayList<>(), ans, 0);
        return new ArrayList<>(ans);


    }
    static void subset(int[] nums, List<Integer> list, Set<List<Integer>> ans, 
    int i)
    {
        if(i== nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        //pick 
        list.add(nums[i]);
