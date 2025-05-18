#include<bits/stdc++.h>
using namespace std;

void selection_sort(int a[],int n){
for(int i=0;i<n;i++){
int m=i;
for(int j=i+1;j<n;j++)
if(a[j]<a[m]) m=j;
swap(a[m],a[i]);
}
}

int main(){
int a[]={5,2,9,1,5,6};
selection_sort(a,6);
for(int x:a) cout<<x<<" ";
}
