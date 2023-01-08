https://leetcode.com/problems/reverse-linked-list/

class Solution {
public:
    ListNode* reverseList(ListNode* head) {

        ListNode * curr = head;
        ListNode * prev = NULL;
        ListNode * N;
        
        while(curr!=NULL)
        {
            N = curr->next;
            curr->next = prev;
            prev = curr;
            curr = N;
        }
        
        return prev;
        
    }
};

