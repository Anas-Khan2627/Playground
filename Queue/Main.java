#include<iostream>
using namespace std;
 void queue(int,int,int*);
int main()
{
  int n,m;
  cin>>n>>m;
  int arr[n];
  for (int i = 0; i<n; i++){
    cin>>arr[i];
  }
   queue(n,m,arr);
  return 1;
}

 void queue(int n,int m,int* a){
   int sum = m,res = 1,k;
   for (int i = 0; i<n-1; i++){
       
       sum -= a[i];
       
       if (sum < a[i+1]){
        res += 1;
        
        sum = m;
       }
  }
   if (n == m)
     cout<<n;
   else
   cout<<res;
 }