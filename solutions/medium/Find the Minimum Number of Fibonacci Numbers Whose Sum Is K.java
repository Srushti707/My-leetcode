// Title: Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/

class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> arr = fibonacci(k);
        int sum = 0, count=0;
        while (sum < k) {
            int value = binarySearch(arr, k - sum);
            count+=1;
            sum += value;
        }
        return count;
    }

    public ArrayList<Integer> fibonacci(int k) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int i = 2;
