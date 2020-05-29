#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n, *a,ev=0,od=0;
  cin>>n;
  a = (int *)calloc(n,sizeof(int));
  for(int i = 0; i<n; i++){
    cin>>a[i];
    if(a[i]%2==0)
      ev++;
    else
      od++;
  }
  cout<<od<<endl;
  cout<<ev;
  return 0;
}