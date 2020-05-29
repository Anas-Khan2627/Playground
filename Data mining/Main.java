#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,se=0,so=0,c=0;
  cin>>n;
  while(n>0){
      c = n%10;
    if(c%2==0)
      se+=c;
    else
      so+=c;
      n /= 10;
  }
  
  
  if (se==so)
    cout<<"Yes";
  else
    cout<<"No";
  return 1;
}
