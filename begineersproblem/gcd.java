import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter first value:");
    int a=sc.nextInt();
    System.out.println("Enter second value:");
    int b=sc.nextInt();
    int max=0;
   if(a>b)
   {
     max=a;
   }
    else
   {
     max=b;
   }
    for(int i=max;i>=1;i--)
      {
        if(a%i==0 && b%i==0)
        {
          System.out.print("The GCD of two numbers is :"+i);
          break;
        }
      }
  }
}
