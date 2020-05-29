#include<iostream>
using namespace std;
int main()
{
  string in;
  int lt = 0;
  getline(cin, in);
  while(true){
  int f = in.find("the", lt);
  if (f == -1)
   break;
  in.replace(f,4, "");
  lt += 4;
  }
  cout<<in;
}