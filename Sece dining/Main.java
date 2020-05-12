#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 string s1;
  cin>>s1;
  int d;
  cin>>d;
  if(s1=="front")
  {
  if(d==1)
    cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(d==1)
    cout<<"Right Handed";
  else
    cout<<"Left Handed";
}