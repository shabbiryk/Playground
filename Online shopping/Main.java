#include<iostream>
using namespace std;
int main()
{
 int f,s,a,f1,f2,f3,a1,a2,a3,s1,s2,s3;
  cin>>f1>>f2>>f3;
  cin>>s1>>s2>>s3;
  cin>>a1>>a2>>a3;
  f=f1-(f1*f2)/100+f3;
  a=a1-(a1*a2)/100+a3;
  s=s1-(s1*s2)/100+s3;
  cout<<"In Flipkart Rs."<<f<<"\nIn Snapdeal Rs."<<s<<"\nIn Amazon Rs."<<a;
  if(f<=a&&f<=s)
    cout<<"\nHe will prefer Flipkart"<<endl;
  else if(s<=a&&s<=f)
    cout<<"\nHe will prefer Snapdeal"<<endl;
  else
    cout<<"\nHe will prefer Amazon"<<endl;
}