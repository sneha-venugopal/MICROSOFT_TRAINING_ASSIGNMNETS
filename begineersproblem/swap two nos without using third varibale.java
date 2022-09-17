import java.util.*;
public class Main
{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   System.out.print("Before Swapping:\nA=" +a+ "\nB=" +b);
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.print("\nAfter Swapping:\nA=" +a+ "\nB=" +b);
   
   }
}
