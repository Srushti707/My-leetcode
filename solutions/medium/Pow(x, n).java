// Title: Pow(x, n)
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/pow(x,-n)/

class Solution {
    public double myPow(double x, int n) {
        //convert negative n to positive
        long N=n;
        if(N<0)
        {
            x=1/x;
            N=-N;
        }
        double ans=1;
        while(N>0)
        {
            if((N & 1)==1)
            {
                ans=ans*x;
            }
            x*=x;
            N=N>>1;
        }
        return ans;
