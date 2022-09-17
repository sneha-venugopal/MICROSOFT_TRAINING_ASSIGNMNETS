#include <stdio.h>

int main()
{
   int n,m=1;
   scanf("%d",&n);
   
   for(int i=0;i<n;i++){
       for(int j=1;j<=i+1;j++){
           printf("%d",j);
          
       }
       printf("\n");
   }
   printf("\n");
   for(int i=1;i<=n;i++){
       for(int j=n;j>=i;j--){
           printf("%d",j);
       }
       printf("\n");
   }

    return 0;
}
