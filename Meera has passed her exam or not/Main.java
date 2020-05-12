#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int array[n];
  for(int i=0;i<n;i++)
{
cin>>array[i];
    
  
}
  int reg;
  cin>>reg;
  for(int i=0;i<n;i++)
  {
  if(array[i]==reg)
  {
    cout<<"She passed her exam";
    return 0;
  }
  }
  cout<<"She failed";
}
  