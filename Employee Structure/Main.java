#include<iostream>
#include<iomanip>
using namespace std;
struct employee { 
  char name[30]; 
  int id;
  int age;
  char designation[20]; 
  float salary; 
}s;
int main()
{
    
    cout<<"Enter name:"<<endl;
    cin.getline(s.name,30);
  
    cout<<"Enter ID:"<<endl;
    cin>>s.id;
    
    cout<<"Enter age:"<<endl;
    cin>>s.age;
  
    cout<<"Enter designation:"<<endl;
    cin.getline(s.designation,20);
    cin.getline(s.designation,20);
    
    cout<<"Enter Salary:"<<endl;
    cin>>s.salary;
    
    cout<<"Employee Details"<<endl;
    cout<<"Name of the Employee : "<<s.name<<endl;
    cout<<"ID of the Employee : "<<s.id<<endl;
    cout<<"Age of the Employee : "<<s.age<<endl;
    cout<<"Designation of the Employee : "<<s.designation<<endl;
    cout<<"Salary of the Employee : "<<setprecision(0)<<fixed<<s.salary<<endl;
    
  }
