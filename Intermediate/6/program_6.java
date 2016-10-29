import java.util.Scanner;
class program_6{
public static void main(String[] args) {

 int[] values = new int[10];  
        Scanner input = new Scanner(System.in);
        //to enter values in array
        System.out.println("Enter the values in array");
        for (int i = 0;i<values.length ; i++) {
            values[i] = input.nextInt();
        }
        input.close();
       // System.out.println("values in array");
        //printing the values of array
        System.out.println("The arrays within the defined range(0,10) are: ");
        for (int j: values) {
            System.out.println(j);
        }


    //int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

    for (int i = 0; i < values.length; i++) {
        for (int j = i + 1; j < values.length; j++) {
            int tmp = 0;
            if (values[i] > values[j]) {
                tmp = values[i];
                values[i] = values[j];
                values[j] = tmp;
            }
        }
    }
System.out.print("Values after sorting: \n");       
        for(int i = 0; i <values.length; i++){
            System.out.println(values[i]+"  ");
        }
}
}
