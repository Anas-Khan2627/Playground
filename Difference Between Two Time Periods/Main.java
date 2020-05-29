#include<iostream>
using namespace std;
struct time{
  int hr;
  int min;
  int sec;
}in,out,res;
int main()
{
  cin>>in.hr>>in.min>>in.sec;
  cin>>out.hr>>out.min>>out.sec;
  if(in.sec < out.sec){
    in.sec += 60;
    in.min--;
  }
  res.sec = in.sec - out.sec;
  
  if(in.min < out.min){
    in.min += 60;
    in.hr--;
  }
  res.min = in.min - out.min;
  res.hr = in.hr - out.hr;
  
  cout<<res.hr<<":"<<res.min<<":"<<res.sec<<endl;
}