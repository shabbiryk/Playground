#include<iostream>
using namespace std;
int fibonacci(int);

int main()
{ 
  int n;
 cin>>n;
 cout<<"The term "<<n<<" in the fibonacci series is "<<fibonacci(n-1);
 
  
}
int fibonacci(int n)
{
    if((n==1)||(n==0))
    {
        return(n);
    }
    else
    {
        return(fibonacci(n-1)+fibonacci(n-2));
    }
}