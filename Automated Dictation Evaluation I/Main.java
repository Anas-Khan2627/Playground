#include<iostream>
using namespace std;
int main()
{
  string in,check;
  getline(cin, in);
  getline(cin, check);
  
  if (in == check)
  cout<<"It is correct";
  else
  cout<<"It is wrong";
}