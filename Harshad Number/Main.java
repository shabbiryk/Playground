#include<iostream>
using namespace std;
int main()
{
  int a,c,b,d;
  c=0;
  cin>>a;
  b=a;
while(a!=0)
{
  d=a%10;
 c+=d;
 a=a/10;
}
 if(b%c==0)
   cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}
  