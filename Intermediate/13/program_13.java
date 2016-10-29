import java.util.*;
class program_13{
public static void main(String args[]){

 //int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };
int[] values = new int[10];  
int max, min=0;
        Scanner input = new Scanner(System.in);
        //to enter values in array
        System.out.println("Enter the values in array");
        for (int i = 0;i<values.length ; i++) {
            values[i] = input.nextInt();
        }
        input.close();
        System.out.println("The arrays within the defined range(0,10) are: ");
        for (int j: values) {
            System.out.println(j);
        }


  

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
System.out.print("The sorted values in the array are: \n");       
        for(int i = 0; i <values.length; i++){
            System.out.println(values[i]+"  ");
        }

max=values[9];
System.out.println("The maximum number in the array :" +max);
min=values[0];
System.out.println("The minimum number in the array :" +min);          
}
}

