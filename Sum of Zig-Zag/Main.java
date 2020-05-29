#include<iostream>
using namespace std;
int main()
{
  int r,c,res = 0;
  cin>>r>>c;
  int a[r][c];
  for (int i = 0 ; i<r ; i++){
    for(int j = 0; j<c; j++){
      cin>>a[i][j];
    }
  }
  
  for (int i = 0 ; i<r ; i++){
    for(int j = 0; j<c; j++){
      
      if (i == 0 || i == r-1)
        res += a[i][j];
      
      else if(i+j == r-1)
        res += a[i][j];
    }
  }
  
  
  
  
  cout<<"Sum of Zig-Zag pattern is "<<res<<endl;
  
}