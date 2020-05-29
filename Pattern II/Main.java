#include <iostream>
using namespace std;
int main(){
    int k = 0;
    int n;
    cin>>n;
    for (int i = 1; i <=n; i++) {
        if (i % 2 != 0) {
            k += i;
            for (int j = 1; j <= i; j++) {
                if (j>1&&j<=i) {
                    cout<<"*";
                }
                cout<<k;
                    k++;
            }
        } else {
            k += i-1;
            for (int j = 1; j <= i; j++) {
                if (j>1&&j<=i) {
                    cout<<"*";
                }
                cout << k;
                k--;
            }
        }
        cout<<"\n";
    }
    return 1;
}