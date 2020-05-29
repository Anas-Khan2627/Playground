#include<iostream>
#include<iomanip>
#include<cstring>
using namespace std;
struct College { 
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage; 
  };
int main()
{
  int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  College s[n],t;
  
  for (int i = 0;i < n; i++){
      
    cout<<"Enter the details of college "<<i+1<<endl;
    
    cout<<"Enter name"<<endl;
    cin>>s[i].name;
    
    cout<<"Enter city"<<endl;
    cin>>s[i].city;
    
    cout<<"Enter year of establishment"<<endl;
    cin>>s[i].establishmentYear;
    
    cout<<"Enter pass percentage"<<endl;
    cin>>s[i].passPercentage;
  }
  
  for (int i = 0;i < n; i++){
    for (int j = i+1;j < n; j++){
      if (strcmp(s[i].name,s[j].name) > 0){
        t = s[i];
        s[i] = s[j];
        s[j] = t;
      }
    }
  }
    cout<<"Details of colleges"<<endl;
  for (int i = 0;i < n; i++){
    cout<<"College:"<<i+1<<endl;
    cout<<"Name:"<<s[i].name<<endl;
    cout<<"City:"<<s[i].city<<endl;
    cout<<"Year of establishment:"<<s[i].establishmentYear<<endl;
    cout<<"Pass percentage:"<<s[i].passPercentage<<endl;
    
  }
}