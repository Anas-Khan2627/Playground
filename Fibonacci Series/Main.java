#include<iostream>
using namespace std;
int fib(int n){
  int a,b;
  if(n==1){
    return 0;
  }
   if(n==2){
    return 1;
  }
  a = fib(n-1)+fib(n-2);
  return a;
}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n)<<endl;
  return 0;
}