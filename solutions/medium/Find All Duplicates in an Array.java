// Title: Find All Duplicates in an Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> arr= new HashMap<>();
        for(int num: nums)
        {
            arr.put(num,arr.getOrDefault(num, 0)+1 );
        }
        List<Integer> ans=new ArrayList<>();
        for(int key : arr.keySet())
        {
            if(arr.get(key)==2) ans.add(key);
        }
        return ans;
    }
}
