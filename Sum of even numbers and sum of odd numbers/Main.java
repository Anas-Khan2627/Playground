#include<iostream>
using namespace std;
int main()
{
  int n,se=0,so=0;
  cin>>n;
  int a[n];
  for(int i = 0; i<n; i++){
    
    cin>>a[i];
    if(a[i]%2==0)
      se += a[i];
    else
      so += a[i];
    
  }
  
  cout<<"The sum of the even numbers in the array is "<<se<<endl;
  cout<<"The sum of the odd numbers in the array is "<<so<<endl;
}