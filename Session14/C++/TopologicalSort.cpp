https://practice.geeksforgeeks.org/problems/topological-sort/1/

    void sorting(int node, vector<int> adj[], stack<int>& s, vector<int>& visited)
    {
        visited[node] = 1;
        for(int nbr:adj[node])
        {
            if(!visited[nbr])
            {
                sorting(nbr, adj, s, visited);
            }
        }
        s.push(node);
    }
    
	public:
	//Function to return list containing vertices in Topological order. 
	vector<int> topoSort(int V, vector<int> adj[]) 
	{
	    stack<int> s;
	    vector<int> visited(V, 0);
	    
	    for(int i=0; i<V; i++)
	    {
	        if(!visited[i])
	        {
	            sorting(i, adj, s, visited);
	        }
	    }
	    
	    vector<int> res;
	    while(!s.empty())
	    {
	        res.push_back(s.top());
	        s.pop();
	    }
	    
	    return res;
	    
	}