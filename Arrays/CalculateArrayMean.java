import java.util.Scanner;
public class CalculateArrayMean 
{
 
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);       
        int numbers[] = new int[100];
        int sum = 0;
        
        System.out.println("entere the number of array elements");
        int n = input.nextInt();

        System.out.println("entere the   array elements");
        for(int i = 0;i<n ;i++ )
            numbers[i] = input.nextInt();


        for(int i=0; i < n ; i++)
            sum = sum + numbers[i];

        double mean = sum / n;
               
        System.out.println("Average value of array elements is : " + mean);
        }
}