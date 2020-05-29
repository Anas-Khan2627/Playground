#include<iostream>
using namespace std;
int isAlpha(char a){
  int val = (int)a;
  if((val >= 65 && val<= 90)||(val >= 97 && val<= 122)){
      switch(a){
          case 'A': case 'a': case 'E': case 'e': case 'I': case 'i': case 'O': case 'o': case 'U': case 'u':
          return 2;
          
          default:
          return 1;
      }
  }
  else if (val >= 48 && val<= 57)
  return 3;
  else if (val == 32)
  return 4;
  else
    return 0;
}
int main()
{
  string in;
  int vowel = 0,cons = 0,dig = 0,sym = 0,ws=0;
  getline(cin, in);
  for(auto i = in.cbegin();i<in.cend();i++){
    if(isAlpha(*i) == 2)
      vowel++;
    else if(isAlpha(*i) == 1)
        cons++;
    else if(isAlpha(*i) == 3)
        dig++;
    else if(isAlpha(*i) == 4)
        ws++;
    else
        sym++;
  }
  cout<<"Vowels:"<<vowel<<endl;
  cout<<"Consonants:"<<cons<<endl;
  cout<<"White Spaces:"<<ws<<endl;
  cout<<"Digits:"<<dig<<endl;
  cout<<"Symbols:"<<sym<<endl;
}