#include<iostream>
using namespace std;
int main()
{
  int tr,sum=0,c=0,n;
  cin>>tr;
  while(sum<tr){
    cin>>n;
      if(n>=tr){
        c++;
        break;
      } else {
        sum+=n;
        c++;
      }
  }
  cout<<"The number of turns is "<<c<<endl;
  return 1;
}
