#include<bits/stdc++.h>
using namespace std;

// 3 = 6
// 3 * fact(2) = 2
// 2 * fact(1) = 1
// 1 * 1


int fact(int n)
{
    // base case
    if(n==0)
    {
        return 1;
    }
    // recursive case
    int smallAns = n * fact(n-1);
    return smallAns;
}

int main(){
    int n;
    cin>>n;
    cout<<fact(n)<<endl;
    return 0;
}