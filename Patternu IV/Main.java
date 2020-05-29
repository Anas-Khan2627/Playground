#include <iostream>
using namespace std;
int main(){
    int k = 0;
    int n;
    cin>>n;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <= n; j++) {
          if(i%2!=0){
            if(j==n)
              cout<<i+1;
            else
              cout<<i;
        } else {
            if(j==1)
              cout<<i+1;
            else
              cout<<i;
          }
        }
        cout<<"\n";
    }
    return 1;
}