#include<iostream>
using namespace std;
int main()
{
  int n,p,m;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  int a[20];
  for(int i = 0; i<n; i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>p;
  
  
  if (p >= 0 && p <= n){
    cout<<"Enter the value to insert"<<endl;
  cin>>m;
    
    for(int i = n + 1; i > p-1 ; i--){
      a[i] = a[i-1];
      
    }
    a[p-1] = m;
    cout<<"Array after insertion is"<<endl;
    for(int i = 0; i <= n; i++)
    	cout<<a[i]<<endl;
  } else {
    cout<<"Invalid Input"<<endl;
  }
}