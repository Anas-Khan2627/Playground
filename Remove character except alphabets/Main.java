#include<iostream>
using namespace std;
int isAlpha(char a){
  int val = (int)a;
  if((val >= 65 && val<= 90)||(val >= 97 && val<= 122))
    return 1;
  else
    return 0;
}
int main()
{
  string in;
  getline(cin, in);
  for(auto i = in.cbegin();i<in.cend();i++){
    if(isAlpha(*i))
      cout<<*i;
  }
}