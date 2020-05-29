#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum;
	getline(cin, fnum);
    int found = fnum.find('.');
    string res;
    if (found != -1){
    res.assign(fnum,found+1,fnum.length()-1);
    
    }
    cout<<"Floating part is : "<<res;
}