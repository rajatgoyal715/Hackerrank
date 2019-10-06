#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long long nchoosek(int n, int k){
    
    if(n<k){
        return 0;
    }
    if(k==0){
        return 1;
    }
    long long res=n;
    for(int i=2;i<=k;i++){
        res*= n-i+1;
        res/=i;
    }
    return res;
}

int main() {
    int t;
    cin>>t;
    while(t--){
        int n,k;
        cin>>n>>k;
        long long t = nchoosek(n+k-1,k-1);
        cout<<t%((long long)pow(10,9)+7)<<endl;
    }
    return 0;
}
