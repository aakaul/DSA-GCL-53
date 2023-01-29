https://practice.geeksforgeeks.org/problems/topological-sort/1/

class Solution
{
    
    static void findTopoSort(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) 
    {
        vis[node] = 1; 
        for(Integer it: adj.get(node)) 
        {
            if(vis[it] == 0) 
            {
                findTopoSort(it, vis, adj, st); 
            } 
        }
        st.push(node); 
    }
    
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> st = new Stack<Integer>(); 
        int vis[] = new int[V]; 
        
        for(int i = 0;i<V;i++) 
        {
            if(vis[i] == 0) 
            {
                findTopoSort(i, vis, adj, st);
            }
        }
        
        int topo[] = new int[V];
        int ind = 0; 
        while(!st.isEmpty()) 
        {
            topo[ind++] = st.pop();
        }

        return topo; 
    }
}