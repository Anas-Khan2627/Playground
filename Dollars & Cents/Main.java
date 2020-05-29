#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,amtd,amtc;
  cin>>d1>>c1>>d2>>c2;
  amtd=d1+d2+((c1+c2)/100);
  amtc=(c1+c2)%100;
  cout<<amtd<<"\n"<<amtc;
  
  return 1;
}