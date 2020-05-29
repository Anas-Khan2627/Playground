#include<iostream>
using namespace std;
int main()
{
  int a=0,b=1,c,n;
  cin>>n;
  if(n==1){
    cout<<0;
} else if(n==2) {
    cout<<1;
  } else {
    while(n-->2){
      c=a+b;
      a=b;
      b=c;
    }
    cout<<c;
  }
  return 1;
}