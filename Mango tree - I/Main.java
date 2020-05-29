#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r;
  cin>>c;
  cin>>n;
  
  if((n>0&&n<=c)||(n>(c-1)*r&&n<=r*c)||(n-1)%c==0)
    cout<<"Yes";
  else
    cout<<"No";
}