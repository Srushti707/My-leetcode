// Title: Valid Anagram
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1= s.toCharArray();
        char[] arr2= t.toCharArray();
        Arrays.sort(arr1);
·‌·‌·‌·‌·‌·‌·‌·‌Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
