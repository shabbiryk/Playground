#include<iostream>
using namespace std;
void swap(int& a, int&b){
int temp;
  temp=a;
  a=b;
  b=temp;
}
int main()
{
  int g,h;
  cin>>g>>h;
  cout<<"Before swapping a= "<<g<<" and b="<<h<<endl;
  swap(g,h);
    cout<<"After swapping a= "<<g<<" and b="<<h<<endl;
}
