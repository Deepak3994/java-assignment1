import java.io.*;
import java.util.Scanner;

class CentroidOfTriangle
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        System.out.println("enter the three co ordinatets of the triangle");

        int x1 = i.nextInt();
        int y1 = i.nextInt();
        int x2 = i.nextInt();
        int y2 = i.nextInt();
        int x3 = i.nextInt();
        int y3 = i.nextInt();

        double CX1 = (x1+x2+x3)/3;
        double CY1 = (y1+y2+y3)/3;

        System.out.println("Centroid(G) (X1,Y1) = ("+CX1+","+CY1+")");
        }
    }
