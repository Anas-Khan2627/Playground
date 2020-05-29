#include<iostream>
using namespace std;
int gcd (int, int);
int main(){
  int a,b,c,d,res;
  cin>>a>>b>>c>>d;
  res = gcd(gcd(a,b),c);
  if (d == res)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
return 1;
}
int gcd(int a, int b){
  int max, min;
  if(a>b){
    max = a;
    min = b;
  } else {
    max = b;
    min = a;
  }
  
  if(min == 0)
    return max;
  else{
    //max % min;
    gcd(min, max % min);
  }
}