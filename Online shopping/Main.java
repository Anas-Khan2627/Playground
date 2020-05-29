#include<iostream>
using namespace std;
int main()
{
  int fp,fd,fs,sp,sd,ss,ap,ad,as;
  float fam,sam,aam;
  cin>>fp;
  cin>>fd;
  cin>>fs;
  fam = fp-(fp*(fd/100.0))+fs;
  cout<<"In Flipkart Rs."<<fam<<endl;
  
  cin>>sp;
  cin>>sd;
  cin>>ss;
  sam = sp-(sp*(sd/100.0))+ss;
  cout<<"In Snapdeal Rs."<<sam<<endl;
  
  cin>>ap;
  cin>>ad;
  cin>>as;
  aam = ap-(ap*(ad/100.0))+as;
  cout<<"In Amazon Rs."<<aam<<endl;
  
  if (fam<=sam&&fam<=aam){
  cout<<"He will prefer Flipkart";
  }
  else if(sam<=aam){
    cout<<"He will prefer Snapdeal";
  }
  else{
  cout<<"He will prefer Amazon";
  }
 return 1;
}