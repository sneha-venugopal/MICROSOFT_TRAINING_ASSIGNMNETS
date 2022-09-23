import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String :");
    String s=sc.nextLine();
    int left=0;
    int right=s.length()-1;
    while(left<right)
      {
        if(s.charAt(left)!=s.charAt(right))
        {
          System.out.print("The given String is Not a PALINDROME");
          return;
        }
        left++;
        right--;
      }
    System.out.print("The given String is a PALINDROME");
    return;
  }
}
