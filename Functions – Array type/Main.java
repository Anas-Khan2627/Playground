#include<iostream>
using namespace std;
int main()
{
  int n,ce = 0,co = 0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  int a[20];
  for(int i = 0; i<n; i++)
    cin>>a[i];
    
    for(int i = 0; i < n ; i++){
      if(a[i]%2==0)
        ce++;
      else
        co++;
    }
    
  if (co == n)
    cout<<"The array is Odd"<<endl;
  else if (ce == n)
    cout<<"The array is Even"<<endl;
   else 
     cout<<"The array is Mixed"<<endl;
}