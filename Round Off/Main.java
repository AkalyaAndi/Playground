#include<stdio.h>
#include<math.h>
int main()
{
  float num;
  scanf("%f",&num);
  printf("%d\n%.1f\n%.1f",(int)num,ceil(num),floor(num));
  return 0;
}