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
  
  for (int i = 0 ; i<c ; i++){
      temp = a[0][i];
      
    for(int j = 0; j<r; j++){
        if(temp < a[j][i])
            temp = a[j][i];
      
    }
    
    cout<<temp<<endl;
  }
  
}