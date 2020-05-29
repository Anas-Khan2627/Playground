#include<iostream>
using namespace std;
int main()
{
  int n,c=0,f=0;
  float sum=0.0;
  while(c<3){
    cin>>n;
    if(n<0){
      sum+=-1;
      break;
    } else if (n%2==0) {
    	sum+=-0.5;
    } else {
      sum++;
      c++;
    }
  }
  cout<<sum;
  return 1;
}