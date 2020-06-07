#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 int a,b,c,d,h,j;
  float e,f,g,k;
  cin>>a>>b>>c>>d;
  h=a/6;
  cout<<h<<"\n";
  j=d/6;
  k=d%6;
  e=(float)(j+(k/10));
  cout<<e<<"\n";
  f=(float)(c/e);
  cout<<fixed<<setprecision(1)<<f<<"\n";
  g=(float)b/h;
  cout<<fixed<<setprecision(1)<<g<<"\n";
  if(f>g)
  {
    cout<<"Eligible to Win";
  }///Type your code here.
  else
  {
    cout<<"Not Eligible to Win";
  }
  return 0;
}