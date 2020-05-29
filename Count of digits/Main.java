#include<iostream>
using namespace std;
int main()
{
  int n,sum=0;
  cin>>n;
  do{
    sum++;
    n/=10;
  }while(n>0);
  
  cout<<sum;
}