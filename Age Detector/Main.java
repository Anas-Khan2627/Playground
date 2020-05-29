#include<iostream>
using namespace std;
int main()
{
  int by,cy,age;
  cin>>by;
  cin>>cy;
  if(by>cy)
    age = (100-by)+cy;
  else
    age = cy-by;
  cout<<age;
}