#include<iostream>
#include<cmath>
using namespace std;
int str(int, int, int);
int main(){
  int m,n,req;
  cin>>m>>n>>req;
  if(str(m,n,req)==1)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 1;
}
int str(int a, int b, int c){
  int res = pow(a,b);
  if (res>=c)
    return 1;
  else
    return 0;
}