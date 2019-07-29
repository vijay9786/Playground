#include<stdio.h>
int main()
{
  int num1,num2,lcm,i,hcf;
  scanf("%d%d",&num1,&num2);
  i=(num1>num2)?num2:num1;
  for(;i>=1;i--)
    {
       if ((num1%i==0)&&(num2%i==00))
        {
           hcf=i;
           break;
         }
      }
  lcm=(num1*num2)/hcf;
  printf("%d",lcm);
  return 0;
}