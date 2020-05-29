#include<iostream>
using namespace std;
int main()
{
  int n;
  float t;
  cin>>n;
  cin>>t;
  switch (n){
    case 1:
      cout<<t;
      break;
    case 2:
      cout<<(t*1.5);
      break;
    case 3:
      cout<<(t*2.0);
      break;
    default:
      cout<<"Number of items is more";
  }
}