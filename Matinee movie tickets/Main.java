#include<iostream>
using namespace std;
int main()
{
  int a;
  float t;
  cin>>a;
  cin>>t;
  if (a>13){
   if (t>13&&t<14)
  	cout<<"$5.00";
  else
   cout<<"$8.00";
  }
  else {
  if (t>13&&t<14)
  	cout<<"$2.00";
  else
   cout<<"$4.00";
  }
}