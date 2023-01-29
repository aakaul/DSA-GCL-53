https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1/

    bool checkCycle(vector<int>& visited, int node, int parent, vector<int> adj[])
    {
        visited[node] = 1;
        for(int nbr:adj[node])
        {
            if(!visited[nbr])
            {
                if(checkCycle(visited, nbr, node, adj))
                {
                    return true;
                }
            }
            else if(nbr!=parent)
            {
                return true;
            }
        }
        return false;
    }
    
    bool isCycle(int V, vector<int> adj[]) {
        // Code here
        vector<int> visited(V, 0);
        for(int i=0; i<V; i++)
        {
            if(visited[i]==0)
            {
                if(checkCycle(visited, i, -1, adj))
                {
                    return true;
                }
            }
        }
        
        return false;
    }