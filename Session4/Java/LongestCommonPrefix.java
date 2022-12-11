https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ans = "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int length = Math.min(first.length(), last.length());
        
        for(int i=0; i<first.length(); i++)
        {
            if(first.charAt(i)==last.charAt(i))
            {
                ans += first.charAt(i);
            }
            else
            {
                break;
            }
        }
        
        return ans;
        
    }
}