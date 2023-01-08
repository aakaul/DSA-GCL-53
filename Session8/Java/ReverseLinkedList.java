https://leetcode.com/problems/reverse-linked-list/

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode N;
        
        while(curr!=null)
        {
            N = curr.next;
            curr.next = prev;
            prev = curr;
            curr = N;
        }
        
        return prev;
        
    }
}

