#include<iostream>
using namespace std;
int main()
{
  int a,b,c,r,d;
  cin>>a;
  cin>>b;
  cin>>c;
  
  if(b%a==0&&c%a==0)
    d=a;
  else if(a%b==0&&c%b==0)
    d=b;
  else if(a%c==0&&b%c==0)
    d=c;
  else
    d=1;
  
  if(a>b){
  	if(a<c)
      r=a;
    else{
    	if(b>c)
          r=b;
      else
        r=c;
    }
  }
  
  else{
  	if(b<c)
      r=b;
    else{
    	if(a>c)
          r=a;
      	else
          r=c;
      
    }
  }
  cout<<"The treasure is in box which has number "<<r<<endl;
  cout<<"The code to open the box is "<<d<<endl;
}
  
