#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int p = n, sum = 0, c =0 ;
    while(n>0){
      c++;
      n /= 10;
    }
  n = p;
  while(n>0){
    sum+=power((n%10),c);
    n /= 10;
  }
  if(sum == p)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}