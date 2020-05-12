#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r;
  cin>>c;
  cin>>t;
if(t<=c)
  cout<<"Yes";
  else if(t%c==1&&t<(c*r))
     cout<<"Yes";
  else if(c%t==0&&t<(c*r))
     cout<<"Yes";
  else
    cout<<"No";
    
    
  
}