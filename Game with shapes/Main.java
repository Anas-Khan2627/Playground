#include<iostream>
using namespace std;
int main()
{
  int r,l;
  cin>>r;
  cin>>l;
   
  if((r*2)<=l)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  
  return 1;
}