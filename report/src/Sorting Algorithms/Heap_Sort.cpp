#include<bits/stdc++.h>
using namespace std;

void heapify(int a[],int n,int i){
int l=2*i+1,r=2*i+2,m=i;
if(l<n&&a[l]>a[m]) m=l;
if(r<n&&a[r]>a[m]) m=r;
if(m!=i){
swap(a[i],a[m]);
heapify(a,n,m);
}
}

void heap_sort(int a[],int n){
for(int i=5/2-1;i>=0;i--)
heapify(a,6,i);
for(int i=5;i>0;i--){
swap(a[0],a[i]);
heapify(a,i,0);
}
}

int main(){
int a[]={5,2,9,1,5,6};
heap_sort(a,6);
for(int x:a) cout<<x<<" ";
}
