https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1/?page=1&status[]=solved&category[]=Linked%20List&sortBy=submissions#

class Solution
{
    public:
    //Function to count nodes of a linked list.
    int getCount(struct Node* head){
    
        //Code here
        int len = 0;
        while(head!=NULL)
        {
            head = head->next;
            len++;
        }
        return len;
    
    }
};