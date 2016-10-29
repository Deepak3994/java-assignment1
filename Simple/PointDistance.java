import java.util.Scanner;
 
public class PointDistance
{
    public static double distance(double x1, double y1, double x2, double y2)
    {
            return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
             
    }
 
    public static void main(String[] args)
    {   
         
        
        double x1, x2, y1, y2;
        double distance;
      
         
        Scanner i = new Scanner (System.in);
         
        System.out.println("Enter the x coordinate for point 1: ");
        x1 = i.nextDouble();
         
        System.out.println("Enter the y coordinate for point 1: ");
        y1 = i.nextDouble();
         
        System.out.println("Enter the x coordinate for point 2: ");
        x2 = i.nextDouble();
         
        System.out.println("Enter the y coordinate for point 2: ");
        y2 = i.nextDouble();
         
        dist = distance(x1,y1,x2,y2);
         
        System.out.println("The distance between the two points is " + dist + " .");
         
    }
     
}
