https://leetcode.com/problems/delete-node-in-a-bst/

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
        {
            return null;
        }
        else if(root.val > key)
        {
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key)
        {
            root.right = deleteNode(root.right, key);
        }
        // root.val == key
        else
        {
            // leaf node
            if(root.left==null && root.right==null)
            {
                return null;
            }
            // 1 child
            else if(root.left==null && root.right!=null)
            {
                return root.right;
            }
            else if(root.left!=null && root.right==null)
            {
                return root.left;
            }
            // 2 child
            TreeNode replace = root.right;
            while(replace.left!=null)
            {
                replace = replace.left;
            }
            root.val = replace.val;
            root.right = deleteNode(root.right, replace.val);
        }
        return root;
    }
}