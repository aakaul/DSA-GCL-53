https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1/?page=1&status[]=solved&category[]=Linked%20List&sortBy=submissions#

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int len = 0;
        while(head!=null)
        {
            head = head.next;
            len++;
        }
        return len;
        
    }
}