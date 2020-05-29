#include<iostream>
using namespace std;
int perf(int n);
int main(){
  int n,t;
  cin>>n;
  cin>>t;
  for(int i = n; i<=t; i++){
    if(perf(i))
      cout<<i<<" ";
  }
 
  return 1;
}

int perf(int n){
  int sum=0;
  
  for(int i = 1; i<n;i++)
    if(n%i==0)
      sum+=i;
  
  if(sum==n)
    return 1;
  else
    return 0;

}