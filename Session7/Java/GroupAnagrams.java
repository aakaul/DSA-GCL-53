https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str:strs) 
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String keyStr = String.valueOf(arr);
            if(map.containsKey(keyStr))
            {
                map.get(keyStr).add(str); 
            }
            else
            {
                map.put(keyStr,new ArrayList<>());
                map.get(keyStr).add(str);
            }
        }
        
        return new ArrayList<>(map.values());
        
    }
}