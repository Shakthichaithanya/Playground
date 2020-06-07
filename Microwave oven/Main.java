#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int x;
  float y,z;
  //Type your code here.
  cin>>x>>y;
  if(x==2)
  {
    z=(float)((50*y)/100)+y;
    cout<<fixed<<setprecision(2)<<z;
  }
  if(x==3)
  {
    z=(float)((50*y)/100)*(x-1)+y;
    cout<<fixed<<setprecision(2)<<z;
  }
  if(x>3)
  {
    cout<<"Number of items is more";
  }
}