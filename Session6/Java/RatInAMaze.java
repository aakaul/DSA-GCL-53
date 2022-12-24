https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

class Solution {
    
    private static void solve(int i, int j, int grid[][], int n, ArrayList <String> ans, String path,int vis[][], int dirx[], int diry[]) 
    {
        if (i == n-1 && j == n-1) {
            ans.add(path);
            return;
        }
        String dir = "DLRU";
        for (int ind = 0; ind < 4; ind++) 
        {
            int nexti = i + dirx[ind];
            int nextj = j + diry[ind];
            if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj] == 0 && grid[nexti][nextj] == 1) 
            {
                vis[i][j] = 1;
                solve(nexti, nextj, grid, n, ans, path + dir.charAt(ind), vis, dirx, diry);
                vis[i][j] = 0;
            }
        }
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int vis[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vis[i][j] = 0;
            }
        }
        int dirx[] = {1,0,0,-1};
        int diry[] = {0,-1,1,0};
        ArrayList <String> ans = new ArrayList <> ();
        if (m[0][0] == 1) 
            solve(0, 0, m, n, ans, "", vis, dirx, diry);
        return ans;
    }
}