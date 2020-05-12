#include<iostream>
using namespace std;
int main()
{
  int n,s,a[10],c=0;
  cin>>n>>s;
  for(int i=1;i<=n;i++)
  {cin>>a[i];
   c+=a[i];}
  if(c<=s)
    cout<<"YES";
  else
    cout<<"NO";
  
}