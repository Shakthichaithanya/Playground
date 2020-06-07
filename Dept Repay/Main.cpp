#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  float d,e,f,g;
  d=(c*a*b)/100;
  cout<<setprecision(6)<<d<<"\n";
  e=(float)a+d;
  cout<<setprecision(6)<<e<<"\n";
  f=(float)d*0.02;
  cout<<setprecision(6)<<f<<"\n";
  g=(float)e-f;
  cout<<setprecision(6)<<g;
  return 0;//Type your code here.
}
