#include<iostream>
using namespace std;
int main()
{
  int r,c,temp;
  cin>>r>>c;
  int a[5][5];
  for (int i = 0 ; i<r ; i++){
    for(int j = 0; j<c; j++){
      cin>>a[i][j];
    }
  }
  
  for (int i = 0 ; i<r ; i++){
      temp = a[i][0];
      
    for(int j = 0; j<c; j++){
        if(temp < a[i][j])
            temp = a[i][j];
      
    }
    
    cout<<temp<<endl;
  }
  
}