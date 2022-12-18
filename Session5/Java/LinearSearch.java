import java.util.*;
class LinearSearch{  

    public static int search(int arr[], int i, int n, int key)
    {
        // base case
        if(i==n)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return search(arr, i+1, n, key);
    }

    public static void main(String args[]){  
        int arr[] = {2,4,5,1,3,7};
        int n = 6;
        int key = 7;
        System.out.print(search(arr, 0, n, key));
    }  
}  