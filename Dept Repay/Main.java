#include<iostream>

using namespace std;
int main()
{
 int p,r,n;
  cin>>p>>r>>n;
  float i=0,a=0,f=0,x=0;
  i=(p*r*n)/100;
  a=i+p;
  f=(i/100)*2.0;
  x=a-f;
  cout<<i<<"\n";
    cout<<a<<"\n";
  cout<<f<<"\n";
  cout<<x<<"\n";

  
}