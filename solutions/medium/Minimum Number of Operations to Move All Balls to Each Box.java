// Title: Minimum Number of Operations to Move All Balls to Each Box
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

class Solution {
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];
        
        for(int j=0; j<ans.length; j++)
        {
             ans[j]=operation;
        }
            int operation=0;
            for(int k=0; k<ans.length; k++)
            {
                if(boxes.charAt(k)=='1') operation+= Math.abs(j-k);
            }
    }
        return ans;
}
