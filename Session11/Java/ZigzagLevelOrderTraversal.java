https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        
        if(root == null)
        {
            return res;
        }
        
        queue.add(root);
        boolean dirLtoR = true; 
        while(!queue.isEmpty())
        {
            int n = queue.size();
            List<Integer> curr = new ArrayList<Integer>(n);
            for(int i=0; i<n; i++) 
            {
                TreeNode f = queue.poll();
                curr.add(f.val);
                if(f.left!=null)
                {
                    queue.add(f.left);
                }
                if(f.right!=null)
                {
                    queue.add(f.right);
                }
            }
            if(dirLtoR)
            {
                res.add(curr);
            }
            else
            {
                Collections.reverse(curr);
                res.add(curr);
            }
            dirLtoR = !dirLtoR; 
            
        }
        return res;
        
    }
}