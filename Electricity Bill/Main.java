#include<iostream>
using namespace std;
int main()
{
  int u;
  int amt;
  std::cin>>u;
  
  if(u<=200)
    amt = 0.5*u;
  else if(u<=400)
    amt = 100+0.65*u;
  else if(u<=600)
    amt = 200+0.8*u;
  else
    amt = 425+1.25*u;
  
  std::cout<<"Rs."<<amt;
  
  return 1;
}
