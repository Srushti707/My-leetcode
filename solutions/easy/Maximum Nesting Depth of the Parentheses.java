// Title: Maximum Nesting Depth of the Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

class Solution {
    public int maxDepth(String s) {
        int count=0, max=0;
        for(char c: s.toCharArray())
        {
            if(c == '(')
            {
        }
                count++;
            }
                max=Math.max(max, count);
            else if(c== ')')
            {
                count--;
            }
    }
        return max ;
}
