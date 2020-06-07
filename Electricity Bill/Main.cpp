#include<iostream>
using namespace std;
int main()
{
 int units,cost;
  cin>>units;
  if(units<=200)
  {
    cost=units*0.5;
    cout<<"Rs."<<cost;
  }//Type your code here.
  else if(units>200 && units<=400)
  {
    cost=units*0.65+100;
    cout<<"Rs."<<cost;
  }
  else if(units>400 && units<=600)
  {
    cost= units*0.8+200;
    cout<<"Rs."<<cost;
  }
  else
  {
    cost=units*1.25+425;
    cout<<"Rs."<<cost;
  }
  return 0;
}
