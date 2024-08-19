#include<iostream>
using namespace std;
int main(){

    int n;
    cout << "Enter n: ";
    cin >> n;
    int m;
    cout << "Enter m: ";
    cin >> m;

    for(int i = 1; i <= n*m; i++){
        for(int j = 1; j <= n*m; j++){
            if(n*j == m*i){
                cout << n*j;
                return 0;
            }
        }
    }
}