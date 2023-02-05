https://leetcode.com/problems/longest-common-subsequence/

// Space O(N*M)
class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        
        int m = text1.size();
        int n = text2.size();
        
        vector<vector<int>> dp(m+1, vector<int>(n+1, 0));
        
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(text1[i-1]==text2[j-1])
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        return dp[m][n];
        
    }
};

// Space Optimised O(N)
class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        
        int m = text1.size();
        int n = text2.size();
        
        vector<int> prev(n+1, 0);
        vector<int> curr(n+1);
        
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(text1[i-1]==text2[j-1])
                {
                    curr[j] = 1 + prev[j-1];
                } 
                else
                {
                    curr[j] = max(prev[j], curr[j-1]);
                }
            }
            prev = curr;
        }
        return curr[n];
    }
};