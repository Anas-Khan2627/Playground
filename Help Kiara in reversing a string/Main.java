#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
cin.get(str, 100);

  for(int i = 0; i < 100; i++){
    if(str[i] == '\0'){
      end = i;
      break;
    }
      count++;
  }
	count = end;
  for(int i = 0; i<end;i++){
    count--;
    rev[i] = str[count];
    
  }
  for(int i = 0; i<end;i++){
    cout<<rev[i];
  }

}