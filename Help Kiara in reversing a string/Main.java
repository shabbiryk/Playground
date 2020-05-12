#include <bits/stdc++.h> 
#include<iostream>
using namespace std; 
int main() 
{ 
    string str;
  getline(cin,str);
  
    // Reverse str[beign..end] 
    reverse(str.begin(), str.end()); 
  
    cout << str; 
    return 0; 
} 