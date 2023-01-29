https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for (Integer value : map.values()) 
        {
            pq.offer(value);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        
        int[] res = new int[k];
        int i=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value >= pq.peek())
            {
                res[i]=key;
                i++;
            }
        }
        
        return res;
        
    }
}