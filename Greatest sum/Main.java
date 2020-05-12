#include<iostream>
using namespace std;
int main()
{   
int a[3][3],k,l,z=0;
 cin>>k>>l;
int i,j,s=0,sum=0;

for(i=0;i<k;i++)
for(j=0;j<l;j++)
cin>>a[i][j];
cout<<"Sum of rows is ";
for(i=0;i<k;i++)
{for(j=0;j<l;j++)
  s=s+a[i][j];
 cout<<s;
 if(s>sum)
 {sum=s;
  z=i;
 }
 s=0;
 cout<<" ";
}
  cout<<endl;
cout<<"Row "<<z+1<<" has maximum sum"<<endl;
  sum=0;
  z=0;
cout<<"Sum of columns is ";
for(i=0;i<k;i++)
{for(j=0;j<l;j++)
  s=s+a[j][i];
 cout<<s;
 if(s>sum)
 {sum=s;
  z=i;
 }
 s=0;
 cout<<" ";
}
  cout<<endl;
cout<<"Column "<<z+1<<" has maximum sum"<<endl;}