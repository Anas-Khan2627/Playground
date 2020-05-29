#include <iostream>

using namespace std;

int main()
{
    int d1,d2,d3,d4,d5,d6,d7,twh;
    float a1,a2,a3,a4,a5,a6,a7,amt,bonus;
    
    cin>>d1>>d2>>d3>>d4>>d5>>d6>>d7;
    
    twh = d2+d3+d4+d5+d6;
    
    if(d1<=8)
    a1 = d1*100;
    else
    a1 = d1*100+(d1-8)*15;
  	if(twh<=40)
  	a1+=(0.5*a1);
    
    
    if(d2<=8)
    a2 = d2*100;
    else
    a2 = d2*100+(d2-8)*15;
    
    
    if(d3<=8)
    a3 = d3*100;
    else
    a3 = d3*100+(d3-8)*15;
    
    
    if(d4<=8)
    a4 = d4*100;
    else
    a4 = d4*100+(d4-8)*15;
    
    
    if(d5<=8)
    a5 = d5*100;
    else
    a5 = d5*100+(d5-8)*15;
    
    
    if(d6<=8)
    a6 = d6*100;
    else
    a6 = d6*100+(d6-8)*15;
    
    
    if(d7<=8)
    a7 = d7*100;
    else
    a7 = d7*100+(d7-8)*15;
  	
  	if(twh<=40)
  	a7+=(0.25*a7);
    
    if (twh > 40)
    bonus = (twh-40)*25;
  
  	
  	
    
    amt = a1+a2+a3+a4+a5+a6+a7+bonus;
    
    cout<<amt;
       
    return 0;
}
