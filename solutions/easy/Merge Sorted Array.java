// Title: Merge Sorted Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=nums1.length-1;
        int k=n-1;
        while(k>=0 && i>=0)
        {
            if(nums1[i]<=nums2[k])
            {
                nums1[j]=nums2[k];
                j--;
                k--;
            }
            else
            {
                nums1[j]=nums1[i];
                j--;
                i--;
            }
        }
