#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int b,r,s,nb;
  float ov,cr,of,tr;
  std::cin>>b;
  std::cin>>r;
  std::cin>>s;
  std::cin>>nb;
  
  ov = b/6.0;
  of = nb/6+((nb%6)*0.1);
  cr = s/of;
  tr = r/ov;
  
  std::cout<<ov<<endl;
  std::cout<<of<<endl;
  printf("%.1f\n",cr);
  std::cout<<std::setprecision(2)<<tr<<endl;
  if (cr>tr)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
  
  
  return 1;
}