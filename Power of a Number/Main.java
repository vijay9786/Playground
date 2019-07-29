#include <stdio.h>
int main()
{
  int area,base,ans=1,i;
  scanf("%d%d",&area,&base);
  if (base>=0)
  {
    for(i=1;i<=base;i++)
    {
      ans=(ans*area);
    }
    printf("%d",ans);
   }
   else
   {
     printf("Wrong input");
   }
   return 0;
}