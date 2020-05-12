#include<iostream>
using namespace std;
int main()
{int n,a,b,c;
 a=0;
 c=0;
 cin>>n;
  while(1){
    cin>>b;
    a+=b;
    c++;
    if (a>=n)
    {cout<<"The number of turns is "<<c;
     break;
  }
}
}