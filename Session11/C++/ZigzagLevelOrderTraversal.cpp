https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        
        if(!root)
        {
            return {};
        }
        
        vector<vector<int>> res;
        queue<TreeNode*> q;
        q.push(root);
        bool dirLtoR = true;
        while(!q.empty())
        {
            int n = q.size();
            vector<int> curr(n);
            for(int i=0; i<n; i++)
            {
                TreeNode* f = q.front();
                q.pop();
                int index = (dirLtoR) ? i : (n-1-i);
                curr[index] = f->val;
                if(f->left)
                {
                    q.push(f->left);
                }
                if(f->right)
                {
                    q.push(f->right);
                }
            }
            dirLtoR = !dirLtoR;
            res.push_back(curr);
        }
        
        return res;
        
    }
};