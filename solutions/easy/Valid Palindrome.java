// Title: Valid Palindrome
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        String sm=s.replaceAll("[^A-Za-z0-9]","").trim().toLowerCase();
        
    }
    static Boolean palindrome(String s, int l, int r)
    {

        return palindrome(s,l+1, r-1);
        return palindrome(sm,0,sm.length()-1);

    }
        if(l>=r) return true;
        //System.out.println(s.charAt(l)+ " "+s.charAt(r));
        if(s.charAt(l)!= s.charAt(r)) return false;
}
