// Title: Subsets
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subsets/


    static void subset(int i, int[] arr, List<Integer> list,List<List<Integer>> ans)
    {
        if(i>=arr.length) 
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        //pick
        list.add(arr[i]);
        subset(i+1, arr, list, ans);
    }
        List<List<Integer>> ans= new ArrayList<>();
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        subset(0, nums, new ArrayList<>(), ans);
        return ans;
