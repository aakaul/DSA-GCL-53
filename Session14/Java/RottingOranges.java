https://leetcode.com/problems/rotting-oranges/

class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 2) 
                    queue.offer(new int[]{i, j});
                else if(grid[i][j] == 1) 
                    freshCount++;
            }
        }
        
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int time = -1;

        while (!queue.isEmpty()) 
        {
            time++;
            int size = queue.size(); 
            for(int i = 0; i < size; i++) 
            {
                int[] now = queue.poll();
                for (int[] dir : dirs) 
                { 
                    int x = now[0] + dir[0];
                    int y = now[1] + dir[1];

                    if (x > grid.length - 1 || x < 0 || y > grid[0].length - 1 || y < 0) 
                        continue;
                    if (grid[x][y] == 1) 
                    {
                        queue.offer(new int[]{x, y});
                        grid[x][y] = 2;
                        freshCount--;
                    }
                }
            }
        }
        
        return freshCount != 0 ? -1 : time;
        
    }
}