#include<iostream>
using namespace std;
int main()
{int r,c;
 cin>>r>>c;
  int matrix1[r][c];
  int matrix2[r][c];
  int sum[r][c];
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  cin>>matrix1[i][j];
  }

  }
 for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  cin>>matrix2[i][j];
  }
 
  }
 for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  sum[i][j]=matrix1[i][j]+matrix2[i][j];
    cout<<sum[i][j]<<" ";
  }
    cout<<"\n";
  }
}