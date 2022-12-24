https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

class Solution{
    
    void solve(int i, int j, vector<vector<int>> &grid, int n, vector<string> &ans, string path, vector<vector<int>> &vis, int dirx[], int diry[]) 
    {
        if (i == n-1 && j == n-1) 
        {
            ans.push_back(path);
            return;
        }
        string dir = "DLRU";
        for (int ind = 0; ind < 4; ind++) 
        {
            int nexti = i + dirx[ind];
            int nextj = j + diry[ind];
            if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && !vis[nexti][nextj] && grid[nexti][nextj] == 1) 
            {
                vis[i][j] = 1;
                solve(nexti, nextj, grid, n, ans, path + dir[ind], vis, dirx, diry);
                vis[i][j] = 0;
            }
        }
  }
    
    public:
    vector<string> findPath(vector<vector<int>> &m, int n) {
        vector <string> ans;
        vector <vector<int>> vis(n, vector<int> (n, 0));
        int dirx[] = {1,0,0,-1};
        int diry[] = {0,-1,1,0};
        if (m[0][0] == 1) 
            solve(0, 0, m, n, ans, "", vis, dirx, diry);
        return ans;
    }
};