#include <iostream>
using namespace std;
struct complex{
  int r;
  int i;
};
complex calc(int ch, complex r, complex i){
  complex res;
    switch (ch){
      case 1:
        res.r = r.r + i.r;
        res.i = r.i + i.i;
        break;
      case 2:
        res.r = r.r - i.r;
        res.i = r.i - i.i;
        break;
      case 3:
        res.r = (r.r * i.r) - (r.i * i.i);
        res.i = (r.i * i.r) + (i.i * r.r);
        break;
    }
  return res;
  }
int main()
{
  complex r;
  complex i;
  complex res;
  int ch;
  cin >> ch;
  cin >> r.r;
  cin >> r.i;
  cin >> i.r;
  cin >> i.i;
  
  if(ch > 3)
  {
    cout << "Invalid choice";
  } 
  else
  {
    res = calc (ch, r, i);
    cout << res.r;
    if (res.i > 0)
      cout << "+";
    cout << res.i<<"i";
  }
}