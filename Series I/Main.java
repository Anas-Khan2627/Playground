#include<iostream>
#include<math.h>
using namespace std;
int main(){
  int n;
  cin>>n;
  float sum=0.5;
  cout<<sum<<" ";
   for(int i = 0; i<n-1;i++){
     sum+=(float)(pow(3,i));
     cout<<sum<<" ";
   }
  
  return 1;
}