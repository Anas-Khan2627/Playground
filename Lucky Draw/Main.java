#include<iostream>
using namespace std;
int main(){
  int n,f=0;
  cin>>n;
  if(n==2){
    cout<<"Eligible";
  } else if(n<2){
      cout<<"Not eligible";
  } else {
    
        for(int i = 2; i<n;i++){
        if(n%i==0){
          f=1;
          break;
            }
          }
          if(f==0){
            cout<<"Eligible";
          } else {
            cout<<"Not eligible";
          }
  }
  
  
  return 1;
}