https://leetcode.com/problems/permutations/

class Solution {
    
    void generatePermutations(int[] nums, int i, List<List<Integer>> res)
    {
        if(i==nums.length)
        {
            List<Integer> subList = new ArrayList<Integer>();
            for(int j=0; j<nums.length; j++)
            {
	            subList.add(nums[j]);
	        }
            res.add(subList);
            return;
        }
        
        for(int j=i; j<nums.length; j++)
        {
            int temp = nums[i]; 
            nums[i] = nums[j];
            nums[j] = temp;
            generatePermutations(nums, i+1, res);
            // backtracking, to restore original array back
            temp = nums[i]; 
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<>();
        generatePermutations(nums, 0, res);
        
        return res;
        
    }
}