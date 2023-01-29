https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1

class Pair
{
    int val;
    int x;
    int y;
    Pair(int val,int x, int y)
    {
        this.val=val;
        this.x=x;
        this.y=y;
    }
}

class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        PriorityQueue<Pair> minHeap= new PriorityQueue<>((a,b) -> a.val-b.val);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            minHeap.add(new Pair(arr[i][0], i, 0));
        }

        while(!minHeap.isEmpty())
        {
            int x=minHeap.peek().x;
            int y=minHeap.peek().y;
            ans.add(minHeap.poll().val);

            if(y+1<K)
            {
                minHeap.add(new Pair(arr[x][y+1], x, y+1));
            }
        }
        return ans;
    }
}