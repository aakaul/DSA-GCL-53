https://leetcode.com/problems/evaluate-reverse-polish-notation/

class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s = new Stack<>();
        for(String i:tokens)
        {
            if("+-*/".contains(i))
            {
                int x = s.pop();
                int y = s.pop();
                if(i.equals("+"))
                {
                    s.push(y+x);
                }
                else if(i.equals("-"))
                {
                    s.push(y-x);
                }
                else if(i.equals("*"))
                {
                    s.push(y*x);
                }
                else
                {
                    s.push(y/x);
                }
            }
            else
            {
                s.push(Integer.parseInt(i));
            }
        }
        
        return s.peek();
        
    }
}