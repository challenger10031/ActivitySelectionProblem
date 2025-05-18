#include<bits/stdc++.h>
using namespace std;

void insertion_sort(int a[],int n){
for(int i=1;i<n;i++){
int k=a[i],j=i-1;
while(j>=0&&a[j]>k){
a[j+1]=a[j];
j--;
}
a[j+1]=k;
}
}

int main(){
int a[]={5,2,9,1,5,6};
insertion_sort(a,6);
for(int x:a) cout<<x<<" ";
}
