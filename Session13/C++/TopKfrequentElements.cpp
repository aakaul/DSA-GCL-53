https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        
        priority_queue<int, vector<int>, greater<int>> pq;
        unordered_map<int, int> freq;
        
        for(auto i:nums)
        {
            freq[i]++;
        }
        
        for(auto i:freq)
        {
            pq.push(i.second);
            
            if(pq.size() > k)
            {
                pq.pop();
            }
        }
        
        vector<int> res;
        
        for(auto i:freq)
        {
            if(i.second >= pq.top())
            {
                res.push_back(i.first);
            }
        }
        
        return res;
        
    }
};