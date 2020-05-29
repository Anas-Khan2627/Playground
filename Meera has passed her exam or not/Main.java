#include<iostream>
using namespace std;
int main()
{
  int n,c,f=0;
  cin>>n;
  int a[n];
  for(int i = 0; i<n; i++ )
    cin>>a[i];
  cin>>c;
  for(int i = 0; i<n; i++ ){
    if(c==a[i]){
      cout<<"She passed her exam";
      f=1;
      break;
    }
  }
  if(f==0)
    cout<<"She failed";
  return 1;
}