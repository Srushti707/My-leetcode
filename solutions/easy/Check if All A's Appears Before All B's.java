// Title: Check if All A's Appears Before All B's
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-if-all-a's-appears-before-all-b's/

class Solution {
    public boolean checkString(String s) {
        int bindex=Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='b') bindex=i;
            if(s.charAt(i)=='a' && i>bindex) return false;
        }
    }
        return true;
}
