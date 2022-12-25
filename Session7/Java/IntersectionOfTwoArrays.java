https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i:nums1)
        {
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        
        List<Integer> temp = new ArrayList<>();
        for(int i:nums2)
        {
            if(mp.containsKey(i) && mp.get(i)>0)
            {
                temp.add(i);
                mp.put(i, mp.get(i)-1);
            }
        }
        
        int[] res = new int[temp.size()];
        int j=0;
        for(int i:temp)
        {
            res[j]=i;
            j++;
        }
        
        return res;
        
    }
}