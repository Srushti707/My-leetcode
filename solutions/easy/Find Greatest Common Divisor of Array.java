// Title: Find Greatest Common Divisor of Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int largest= nums[nums.length-1];
        int smallest=nums[0];

    }
    static int gcd(int a, int b)
    {
        if(b==0) return a;
    }
        return gcd(b,(a%b));
        return gcd(largest,smallest);
}
