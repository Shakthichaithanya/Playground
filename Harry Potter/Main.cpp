#include<iostream>
using namespace std;
int main()
{
  int a,b,c,e,d,sum=0;
  cin>>a;
  b=a%10;
  e=a;
  while(a>0)
  {
    c=a%10;
    sum=sum+c*10;
    a=a/10;
  }
  if(e>1000)
  {
    d=b+c;
  }
  else
  {
    sum=sum%10;
    d=b+sum;
  }
  cout<<d;
  return 0;
    //Type your code here.
}
