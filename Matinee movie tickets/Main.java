#include<iostream>
using namespace std;
int main()
{
  int age;
  int time;
  cin>>age;
  cin>>time;
  if(time==13||time==18||time==22)
  {
   if(age>13)
     cout<<"$5.00";
    else
      cout<<"$2.00";
  
  }
  else
  {
  if(age>13)
     cout<<"$8.00";
    else
      cout<<"$4.00";
  
  }
}