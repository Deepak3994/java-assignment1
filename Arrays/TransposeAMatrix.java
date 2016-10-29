import java.util.Scanner;
 
class TransposeAMatrix
{
   public static void main(String args[])
   {
      int row, col, c, d;
 
      Scanner in = new Scanner(System.in);
      
      row = 3;
      col = 3;
 
      int matrix[][] = new int[row][col];
 
      System.out.println("Enter the elements of matrix");
 
      for ( c = 0 ; c < row ; c++ )
         for ( d = 0 ; d < col ; d++ )
            matrix[c][d] = in.nextInt();
 
      int transpose[][] = new int[row][col];
 
      for ( c = 0 ; c < row ; c++ )
      {
         for ( d = 0 ; d < col ; d++ )               
            transpose[d][c] = matrix[c][d];
      }
 
      System.out.println("Transpose of entered matrix:-");
 
      for ( c = 0 ; c < row ; c++ )
      {
         for ( d = 0 ; d < col ; d++ )
               System.out.print(transpose[c][d]+"\t");
 
         System.out.print("\n");
      }
   }
}

