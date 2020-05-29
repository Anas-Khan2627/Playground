#include<iostream>
#include<string>
using namespace std;
int main()
{
  string in,check;
  getline(cin, in);
  getline(cin, check);
  int j=0,f=0;
  for(auto i = in.crbegin();i<in.crend();i++){
    if(*i != check[j]){
        f = 1;
        cout<<"It is wrong";
        break;
    }
    j++;
  }
  if(f == 0)
  cout<<"It is correct";
  
}