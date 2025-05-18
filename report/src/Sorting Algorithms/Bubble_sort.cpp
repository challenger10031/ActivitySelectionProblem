#include<bits/stdc++.h>
using namespace std;

void bubble_sort(int a[],int n){
for(int i=0;i<n-1;i++)
for(int j=0;j<n-1-i;j++)
if(a[j]>a[j+1])
swap(a[j],a[j+1]);
}

int main(){
int a[]={5,2,9,1,5,6};
bubble_sort(a,6);
for(int x:a) cout<<x<<" ";
}
