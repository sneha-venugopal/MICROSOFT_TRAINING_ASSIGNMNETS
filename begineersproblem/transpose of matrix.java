import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row length :");
    int R=sc.nextInt();
    System.out.println("Enter the coloum length :");
    int C=sc.nextInt();
    int matrix[][]=new int[R][C];
    System.out.println("Enter the matrix :");
    for(int row=0;row<R;row++)
      {
        for(int col=0;col<C;col++)
          {
            matrix[row][col]=sc.nextInt();
          }
      }
    System.out.println("The mtrix after Trasposing it is :");
    for(int col=0;col<C;col++)
      {
        for(int row=0;row<R;row++)
          {
            System.out.print(matrix[row][col]+" ");
          }
        System.out.println("");
      }
    
  }
}
