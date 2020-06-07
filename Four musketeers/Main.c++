#include<iostream>
#include<iomanip>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  float x1,x2,x3,y1,y2,y3;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float a=(x1+x2+x3)/3;
  float b=(y1+y2+y3)/3;
  cout<<setprecision(6);
  cout<<a<<endl<<b;
  return 0;
}
