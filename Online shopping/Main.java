#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d,e,f,g,h,i,j,k,l;
  float m,n,o;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  //Type your code here.
  m=(float)(b*a)/100;
  n=(float)(e*d)/100;
  o=(float)(h*g)/100;
  j=a-m+c;
  k=d-n+f;
  l=g-o+i;
  cout<<"In Flipkart Rs."<<j<<"\n";
  cout<<"In Snapdeal Rs."<<k<<"\n";
  cout<<"In Amazon Rs."<<l<<"\n";
  if(j<=k && j<=l)
  {
    cout<<"He will prefer Flipkart";
  }
  if(k<j && k<l)
  {
    cout<<"He will prefer Snapdeal";
  }
  if(l<k && l<j)
  {
    cout<<"He will prefer Amazon";
  }
  return 0;
}