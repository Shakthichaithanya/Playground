#include<iostream>
using namespace std;
int main()
{
  int x;
  float y;
  cin>>x>>y;
  //Type your code here.
  if(y>12 && y<18)
  {
    if(x>13)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$2.00";
    }
  }
  else
  {
    if(x>13)
    {
      cout<<"$8.00";
    }
    else
    {
      cout<<"$4.00";
    }
  }
  return 0;
}