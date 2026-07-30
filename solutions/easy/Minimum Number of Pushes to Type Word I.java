// Title: Minimum Number of Pushes to Type Word I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/

class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
       if( len<=8) return len;
       if(len>8 && len<=16) return 8+(2*(len-8));
       if(len>16 && len<=24) return 8+(2*8)+(3*(len-16));


    }
       else return 8+(2*8)+(3*8)+(4*(len-24));
}
