#include<iostream>
#include <bits/stdc++.h> 
#include<string>
using namespace std;
int main()
{
  string s,v;
  cin>>s>>v;
  reverse(s.begin(),s.end());
  if(s==v)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}