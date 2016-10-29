import java.util.Scanner;
 
class program_10
{
   public static void main(String args[])
   {
      int num, reverse = 0;
 
      System.out.println("Enter a number:");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
 
      while( num != 0 )
      {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;          
       
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }
}





