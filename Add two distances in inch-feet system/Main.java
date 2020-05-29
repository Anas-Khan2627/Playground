#include<iostream>
using namespace std;
struct distance{
  float inch,feet;
}in,out,res;
int main()
{
  int carry = 0, cy;
  cin>>in.inch>>in.feet>>out.inch>>out.feet;
  res.feet = in.feet + out.feet;
  if(res.feet >= 12){
    carry = 1;
    res.feet -= 12.0;
  }
  res.inch = in.inch + out.inch + carry;
  cout<<res.inch<<"\'-"<<res.feet<<"\""<<endl;
}