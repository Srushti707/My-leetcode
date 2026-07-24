// Title: Unique Paths
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/unique-paths/

    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left= count(r-1,c,dp);
        int right= count(r,c-1,dp);
        return left+right;
        if(dp[r][c]!=0)
        {
            return dp[r][c];
        }

        dp[r][c]=left+right;
    }
}
