// Title: Palindrome Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0 ))
        { 
            return false;
        }
        int str= x;
        int a= 0;
        while(x>a)
        {
            int digit=x%10;
            a= a*10+(digit);
            x=x/10;

        }
        if(x==a || x==a/10)
        {
            return true;
