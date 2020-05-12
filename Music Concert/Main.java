#include<iostream>
using namespace std;
int main(){
  int *a,n,k=0,j=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  
  for(int i=0;i<n;i++)
  {cin>>*(a+i);
  if(*(a+i)%2==0)
  k++;
  else
  j++;}
  cout<<j<<endl<<k;
  return 0;
}