#include<iostream>
using namespace std;
int chck(int n,int *a)
{
  int t=0;
  for(int i=0;i<n;i++){
if(a[i]%2==0)
	t++;
}
  if(t==n)
    return 1;
  else if(t==0)
  	return 2;
  else
    return 3;
}

int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[20];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  cin>>a[i];
   int z=chck(n,a);
  if(z==1)
    cout<<"The array is Even";
else if(z==2)
  cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}