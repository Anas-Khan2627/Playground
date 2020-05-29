#include<iostream>
using namespace std;
int main()
{
  int w,a,c,t;
  std::cin>>w;
  std::cin>>a;
  std::cin>>c;
  t = (a*75)+(c*30);
  
  if(t<=w)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
  
  return 1;
}