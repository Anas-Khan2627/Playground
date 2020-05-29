#include<iostream>
using namespace std;
int perf(int n);
int main(){
  int n,t;
  cin>>n;
  cin>>t;
  if(perf(n+t)){
    cout<<"They can read the message";
  } else {
    cout<<"They can't read the message";
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