#include<iostream>
#include<math.h>
using namespace std;
int main(){
  int n;
  cin>>n;
  int sum=6;
  cout<<sum<<" ";
   for(int i = 1; i<n;i++){
     sum+=(i*5);
     cout<<sum<<" ";
   }
  
  return 1;
}