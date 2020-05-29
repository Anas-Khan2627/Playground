#include<iostream>
using namespace std;
int main()
{
  float m;
  int l,p;
  cin>>m;
  cin>>l;
  cin>>p;
  if((m*l)>p)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}