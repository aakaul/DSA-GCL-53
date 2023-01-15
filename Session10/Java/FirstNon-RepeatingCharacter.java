https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1/?page=1&status[]=solved&category[]=Stack&category[]=Queue&sortBy=submissions#

class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        String ans = "";
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        
        for(int i=0; i<A.length(); i++)
        {
            q.add(A.charAt(i));
            freq[A.charAt(i)-'a']++;
            
            while(!q.isEmpty())
            {
                if(freq[q.peek()-'a'] > 1)
                {
                    q.poll();
                }
                else
                {
                    break;
                }
            }
            if(q.isEmpty())
            {
                ans += '#';
            }
            else
            {
                ans += q.peek();
            }
            
        }
        
        return ans;
    }
}