// Title: First Missing Positive
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/first-missing-positive/

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int num: nums)
        {
            set.add(num);
        }
        for(int i=1; i<=nums.length+1; i++)
        {
            System.out.println(i);
            else return i;
        }
        return -1;
    }
            if(set.contains(i)) continue;
}
