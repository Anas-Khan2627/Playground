#include<iostream>
#include<math.h>
using namespace std;
int main(){
  int n,k=6,sum=2;
  cin>>n;
  cout<<0<<" ";
   for(int i = 1; i<n;i++){
       
     if(i%2!=0&&i>1)
        k+=4;
        
        cout<<sum<<" ";
        sum+=k;
   }
  
  return 1;
}