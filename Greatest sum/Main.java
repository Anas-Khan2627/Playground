#include<iostream>
using namespace std;
int main()
{
  int r,c,temp = 0,max = 0,res = 0;
  cin>>r>>c;
  int a[r][c];
  for (int i = 0 ; i<r ; i++){
    for(int j = 0; j<c; j++){
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for (int i = 0 ; i<r ; i++){
      temp = 0;
    for(int j = 0; j<c; j++){
            temp += a[i][j];
    }
    if (max < temp){
      max = temp;
      res = i;
    }
    cout<<temp<<" ";
  }
  cout<<endl;
  cout<<"Row "<<res+1<<" has maximum sum"<<endl;
  
  max = 0;
  cout<<"Sum of columns is ";
  for (int i = 0 ; i<c ; i++){
      temp = 0;
    for(int j = 0; j<r; j++){
        
            temp += a[j][i];
    }
    if (max < temp){
      max = temp;
      res = i;
    }
    cout<<temp<<" ";
  }
  cout<<endl;
  cout<<"Column "<<res+1<<" has maximum sum"<<endl;
  
}