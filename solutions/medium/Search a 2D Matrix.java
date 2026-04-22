// Title: Search a 2D Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-a-2d-matrix/

        // }
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if (matrix[i][j]==target) return true;

            }
        }

        // {
        // while(start<=end)

    public boolean searchMatrix(int[][] matrix, int target) {
        // int start=0;
        // int end=matrix[0].length-1;
class Solution {
