#include<iostream>
using namespace std;
int main()
{int n;
 cout<<"Enter the number of elements in the array"<<endl;
 cin>>n;
cout<<"Enter the elements in the array"<<endl;
 int a[20];
 for(int i=0;i<n;i++)
   cin>>a[i];
 cout<<"Enter the location where you wish to insert an element"<<endl;
 int l;
 cin>>l;
 if(l<=n){
 cout<<"Enter the value to insert"<<endl;
 int e;
 cin>>e;
 for(int i=n;i>=l-1;i--){
   a[i+1]=a[i];
 }
 a[l-1]=e;
 cout<<"Array after insertion is"<<endl;
 for(int i=0;i<n+1;i++)
   cout<<a[i]<<endl;}
 else
   cout<<"Invalid Input";
}