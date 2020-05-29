#include<iostream>
using namespace std;
int printresult(int*,int,int);
int main()
{
  int n,s;
  cin>>n>>s;
  int a[n];
  for(int i = 0; i<n; i++)
    cin>>a[i];
  
  if (printresult(a,n,s))
    cout<<"YES";
  else
    cout<<"NO";
  
  return 0;
}
 int printresult(int *a,int n,int s){
   int sum=0;
   for(int i = 0; i<n; i++){
     sum += a[i];
   }
   
   if (sum <= s)
    return 1;
  else
    return 0;
   
 }