#include<iostream>
using namespace std;
int perf(int n);
int main(){
  int n;
  cin>>n;
  if(perf(n)){
    cout<<"Harshad Number";
  } else {
    cout<<"Not Harshad Number";
  }
 
  return 1;
}

int perf(int n){
  int sum=0,p=n;
  while(n>0){
    sum+=(n%10);
    n/=10;
  }
  if(p%sum==0){
    return 1;
  } else {
    return 0;
  }

}