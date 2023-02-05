https://leetcode.com/problems/longest-common-subsequence/

// Space O(N*M)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
        
        int dp[][] = new int[m + 1][n + 1]; 
        
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        return dp[m][n];
        
    }
}

// Space Optimised O(N)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
        
        int[] prev = new int[n+1];
        int[] curr = new int[n+1];
        
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    curr[j] = 1 + prev[j-1];
                }
                else
                {
                    curr[j] = Math.max(prev[j], curr[j-1]);
                }
            }
            for(int k=0; k<=n; k++)
            {
                prev[k] = curr[k];
            } 
        }
        return curr[n];
    }
}