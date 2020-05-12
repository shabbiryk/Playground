#include<iostream>
int sumZigZag(int, int, int a[][10]);
using namespace std;
int main()
{
  int n,m;
  cin>>m>>n;
  int arr[10][10];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>arr[i][j];
  int sum=sumZigZag(m,n,arr);
  cout<<"Sum of Zig-Zag pattern is "<<sum<<endl;
  
}
int sumZigZag(int m, int n, int a[][10])
{
  int sum=0;
for(int i=0;i<m;i++)
  for(int j=0;j<n;j++)
  {
  if(i==0||i==m-1)
  {
  sum=sum+a[i][j];
  }
  else if(i==j)
    sum=sum+a[i][j];
    }
  
  return sum;
}