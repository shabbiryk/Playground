#include<iostream>
using namespace std;
struct Distance
{
  int feet;
  float inch;
  };
void add(struct Distance d1,struct Distance d2,struct Distance *sum)
{
  sum->feet=d1.feet+d2.feet;
sum->inch=d1.inch+d2.inch;
  if(sum->inch>12.0)
  {
    sum->inch-=12.0;
    sum->feet++;
  }
}
int main()
{
  struct Distance d1,d2,sum;
  cin>>d1.feet;
  cin>>d1.inch;
  cin>>d2.feet;
  cin>>d2.inch;
  add(d1,d2,&sum);
  cout<<sum.feet<<"'-"<<sum.inch<<"\""<<endl;
  
  
}