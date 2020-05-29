#include<iostream>
using namespace std;
int main()
{
  string in;
  char ch;
  getline(cin, in);
  ch = in.back();
  cout<<in<<endl;
  while(in != "####"){
      getline(cin, in);
      
      if(ch == in.front()){
        cout<<in<<endl;
        ch = in.back();
      }
    }
  }
