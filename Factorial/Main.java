#include<iostream>
using namespace std;
int fact(int n){
  int fac = 1;
  if(n==1){
    return fac;
  }
    fac = n * fact(n-1);
}
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n)<<endl;
  return 0;
}