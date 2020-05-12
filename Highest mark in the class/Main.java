#include<iostream>
using namespace std;
int main()
{
  int size;
  cin>>size;
  int array[size];
  for(int i=0;i<size;i++)
    
  cin>>array[i];
  
  int max=0;
  for(int i=0;i<size;i++)
  {
  if(array[i]>max)
    max=array[i];
  }
  cout<<max;
}