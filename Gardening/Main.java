
#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(r<n && r*2>=n)
  {
    cout<<"It is a mango tree";
  }
  else if(r*(c-2)<n && r*(c-1)>=n)
  {
    cout<<"It is a mango tree";
  }
  else 
  {
    cout<<"It is not a mango tree";
  }
  //Type your code here.
  return 0;
}//Type your code here.
