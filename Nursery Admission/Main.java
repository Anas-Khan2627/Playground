#include<iostream>
#include<string>
using namespace std;
int main()
{
  string in;
  int count = 0;
  getline(cin, in);
  for(auto i = in.cbegin(); i<in.cend(); i++)
    count++;
  cout<<"The number of letters in the name is "<<count<<endl;
}