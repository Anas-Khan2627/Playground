#include<iostream>
using namespace std;
int gcd(int n, int m){
  int max,min;
   
  if(n>m){
      max = n;
    min = m;
  } else {
    max = m;
    min = n;
  }
  
  
  if(min==0)
  return max;
  gcd(min,max%min);
}
int main()
{
  int n,m;
  cin>>n>>m;
  cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<gcd(n,m)<<endl;
  return 0;
}