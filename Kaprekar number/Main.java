#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,sum,sq,p=0,c=0;
  cin>>n;
  p=n;
  sq = n*n;
  while(p>0){
      c++;
      p /= 10;
  }
  
  sum = (sq%(int)pow(10,c))+(sq/(int)pow(10,c));
  
  if (sum==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  return 1;
}
