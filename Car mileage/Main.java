#include<iostream>
using namespace std;
int main()
{
  float x,a;
  int y,z;
  cin>>x>>y>>z;
  //Type your code here.
  a= (float)z/y;
  if(a>x)
  {
    cout<<"Cannot reach";
  }
  else
  {
    cout<<"Can reach";
  }
}