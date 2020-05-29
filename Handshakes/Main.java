#include<iostream>
using namespace std;
int perf(int n);
int main(){
  int n;
  cin>>n;
  cout<<perf(n);
 
  return 1;
}

int perf(int n){
  int sum=0;
  
  for(int i = n; i>0;i--)
    for(int j = 1; j<i; j++)
        sum++;
  
  return sum;

}