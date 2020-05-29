#include<iostream>
using namespace std;
int main()
{
  int r,c,temp = 0;
  cin>>r>>c;
  int a[r][c];
  for (int i = 0 ; i<r ; i++){
    for(int j = 0; j<c; j++){
      cin>>a[i][j];
    }
  }
 
  for (int i = 0 ; i<r ; i++){
      temp = 0;
    for(int j = 0; j<c; j++){
            temp += a[i][j];
    }
    cout<<temp<<endl;
  }
}