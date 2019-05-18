#include<stdio.h>
int main()
{
int i,j,l,r,c=0,cn=0;
scanf("%d %d",&l,&r);
for(i=l;i<=r;i++)
{
 for(j=1;j<=i;j++)
 {
  if(i%j==0)
  {
  c++;
  }
 }
 if(c==2)
 {
 cn++;
 }
 c=0;
}
printf("%d",cn);
return 0;
}
