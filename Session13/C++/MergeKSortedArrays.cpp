https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1

typedef pair<int, pair<int, int>> node;
class Solution
{
    public:
    //Function to merge k sorted arrays.
    vector<int> mergeKArrays(vector<vector<int>> arr, int K)
    {
        //code here
        priority_queue<node, vector<node>, greater<node>> pq;
        for(int i=0; i<K; i++)
        {
            pq.push({arr[i][0], {i, 0}});
        }
        
        vector<int> res;
        while(!pq.empty())
        {
            node current = pq.top();
            pq.pop();
            res.push_back(current.first);
            
            int x = current.second.first;
            int y = current.second.second;
            
            if(y+1 < K)
            {
                pq.push({arr[x][y+1], {x, y+1}});
            }
        }
        return res;
    }
};