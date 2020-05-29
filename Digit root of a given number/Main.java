#include<iostream>
using namespace std;
int sum(int n){
  int res;
   
  if(n<=9){
      
    return n%10;
  }
  
  res = (n%10)+sum(n/10);
  
  if(res>9)
  sum(res);
  else
  return res;
}
int main()
{
  int n;
  cin>>n;
  cout<<sum(n)<<endl;
  return 0;
}