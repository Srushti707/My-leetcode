// Title: Find the Highest Altitude
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int n=0, high=0;
        for(int g: gain)
        {
            n=n+g;
            if(n>high) high=n;
        }
    }
        return high;
}
