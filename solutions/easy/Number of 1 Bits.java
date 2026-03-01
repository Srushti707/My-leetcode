// Title: Number of 1 Bits
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-1-bits/

class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
