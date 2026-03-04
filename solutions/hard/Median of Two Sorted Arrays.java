// Title: Median of Two Sorted Arrays
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

        
        if(arr3.length%2==0) 
        {
            double num1=arr3[mid];
            double num2= arr3[mid+1];
            return (num1+num2)/2;
        }
        int mid=start+(end-start)/2;
        int end= arr3.length-1;
        int start=0;
        Arrays.sort(arr3);

       System.arraycopy(nums2 , 0 , arr3, nums1.length , nums2.length);
       System.arraycopy(nums1,0 , arr3, 0, nums1.length);
       int[] arr3= new int[nums1.length + nums2.length];
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
