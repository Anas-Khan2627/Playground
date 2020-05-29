#include<iostream>
using namespace std;
void print (int);
int main()
{
  int n,m,res;
  cin>>n>>m;
  if (n<m)
    res = n;
  else
    res = m;
  print(res);
}
void print(int n){
  if(n%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}