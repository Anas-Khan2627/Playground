#include<iostream>
using namespace std;
int main()
{
  int n,f=0;
  cin>>n;
  int sum[2];
  int a[5][5];
  for (int i = 0 ; i<n ; i++){
    for(int j = 0; j<n; j++){
      cin>>a[i][j];
    }
  }
  sum[0] = 0;
  for (int i = 0 ; i<n ; i++){
    for(int j = 0; j<n; j++){
      if(i+j == (n-1)){
        sum[0] += a[i][j]; 
    }
   }
  }
  
  sum[1] = 0;
  for (int i = 0 ; i<n ; i++){
    for(int j = 0; j<n; j++){
      if(i == j){
        sum[1] += a[i][j]; 
    }
   }
  }
    
    if(sum[0] == sum[1]){
      cout<<"Yes";
    } else {
      cout<<"No";
    }
}