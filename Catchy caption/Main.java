#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   char ptr[100];
   int ctr = 0,f=0;
   cin.getline(ptr, 100);
   int len = strlen(ptr);
   for(int i = 0; i<len; i++){
     
     if(ptr[i] == ' ')
       ctr++;
     if(ctr>10){
       f = 1;
       cout<<"Caption not eligible for the contest"<<endl;
       break;
     }
     
   }
   if (f == 0)
     cout<<"Caption eligible for the contest"<<endl;
   
}