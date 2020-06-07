#include<iostream>
using namespace std;
int main()
{
  int x,y,z,i,a;
  //Type your code here.
  cin>>x>>y>>z;
  if(x>y && x>z)
  {
    if(y>z)
    {
      cout<<"The treasure is in box which has number "<<y<<"\n";
    }
    else
      cout<<"The treasure is in box which has number "<<z<<"\n";
  }
  if(y>x && y>z)
  {
    if(x>z)
      cout<<"The treasure is in box which has number "<<x<<"\n";
    else 
      cout<<"The treasure is in box which has number "<<z<<"\n";
  }
  if(z>x && z>y)
  {
    if(x>y)
      cout<<"The treasure is in box which has number "<<x<<"\n";
    else
     cout<<"The treasure is in box which has number "<<y<<"\n";
  }
  for(i=1;i<10;i++)
  {
    if(x%i==0 && y%i==0 && z%i==0)
      a=i;
  }
  cout<<"The code to open the box is "<<a;
  return 0;
}