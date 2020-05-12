#include<iostream>
using namespace std;
int main()
{
int n,t1,t2,nextterm;
cin>>n;
t1=0;
t2=1;
for(int i=0;i<n;i++){
if(i>1){  
nextterm=t1+t2;
t1=t2;
t2=nextterm;
}
}
  cout<<nextterm;
}