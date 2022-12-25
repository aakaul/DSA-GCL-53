https://leetcode.com/problems/group-anagrams/

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        unordered_map<string, vector<string>> m;
        string original;
        
        for(auto str:strs)
        {
            original = str;
            sort(str.begin(), str.end());
            m[str].push_back(original);
        }
        
        vector<vector<string>> result;
        for(auto i:m)
        {
            result.push_back(i.second);
        }
        
        return result;
        
    }
};