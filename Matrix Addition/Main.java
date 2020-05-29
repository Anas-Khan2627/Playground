#include<iostream>
using namespace std;
int** createArray(int,int);
int getElement(int**, int** ,int,int);
int addMatrix(int**,int**,int**,int,int);
int main()
{
  int r, c;
  cin>>r>>c;
  int **a = createArray(r,c);
  int **b = createArray(r,c);
  int **res = createArray(r,c);
  getElement(a,b, r,c);
  addMatrix(a, b, res, r,c);
  
  for (int i = 0 ; i<r ; i++){
    
    for(int j = 0; j<c; j++){
      cout<<res[i][j]<<" ";
    }
    cout<<endl;
 }
} 

  int** createArray(int r,int c){
    int **a = (int **)malloc(r*sizeof(int*));
    for(int i = 0; i<r; i++)
      *(a+i)=(int *)malloc(c*sizeof(int));
  return a;
  }

int getElement(int **a, int **b, int r,int c){
  for (int i = 0 ; i<r ; i++){
    
    for(int j = 0; j<c; j++){
      cin>>a[i][j];
    }
 }
 
 for (int i = 0 ; i<r ; i++){
    
    for(int j = 0; j<c; j++){
      cin>>b[i][j];
    }
 }
 
 

}

int addMatrix(int **a,int **b,int **res,int r,int c){
  for (int i = 0 ; i<r ; i++){
    
    for(int j = 0; j<c; j++){
      res[i][j] = a[i][j] + b[i][j];
    }
 }

}