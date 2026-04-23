// Title: Number of Steps to Reduce a Number to Zero
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps(int num) {
        return reduce(num,0);
    }
    static int reduce(int n, int c)
    {
        if(n==0) return c;
        if((n&1)==0) return reduce(n>>1,c+1);
    }
        return reduce(n-1,c+1);
}
