#include<iostream>
using namespace std;
int main()
{   
int a[10][10],k,l;
 cin>>k>>l;
int i,j,s=0;

for(i=0;i<k;i++)
for(j=0;j<l;j++)
cin>>a[i][j];

for(i=0;i<k;i++)
{for(j=0;j<l;j++)
{if(a[i][j]>s)
    s=a[i][j];}
}
cout<<"The maximum element is "<<s;}