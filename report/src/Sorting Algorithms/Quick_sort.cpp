#include<bits/stdc++.h>
using namespace std;

int partition(int a[],int l,int h){
int p=a[h],i=l-1;
for(int j=l;j<h;j++)
if(a[j]<=p)
swap(a[++i],a[j]);
swap(a[i+1],a[h]);
return i+1;
}

void quick_sort(int a[],int l,int h){
if(l<h){
int p=partition(a,l,h);
quick_sort(a,l,p-1);
quick_sort(a,p+1,h);
}
}

int main(){
int a[]={5,2,9,1,5,6};
quick_sort(a,0,5);
for(int x:a) cout<<x<<" ";
}
