#include<iostream>
using namespace std;
int main()
{
  int c,r,n,lr,fr;
  std::cin>>r;
  std::cin>>c;
  std::cin>>n;
  fr=(n-2)/c;
  lr=(n-(c-1))/c;
  if((n>r&&n<=2*r)||(n>(c-2)*r&&n<=(c-1)*r))
    std::cout<<"It is a mango tree";
  
  else
    std::cout<<"It is not a mango tree";
  
  return 1;
}