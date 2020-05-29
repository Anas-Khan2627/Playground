#include <iostream>
using namespace std;
int main(){
    int k = 1;
    int n;
    cin>>n;
    int m = (n*(n+1))-(n-1);
    for (int i = 1; i <= n; i++) {

        for (int j = 2; j <i*2; j++) {
            cout<<"-";
        }

        for (int j = n; j >= i; j--) {
            if(j>0&&j<n){
                cout<<"*";
            }
            cout<<k;
            k++;
        }

        int l = m;
        for (int j = n; j >= i; j--) {
            if (j >= i ) {
                cout << "*";
            }
            cout << l;
            l++;
        }
        m-=(n-i);
        cout<<endl;
    }
    return 1;
}