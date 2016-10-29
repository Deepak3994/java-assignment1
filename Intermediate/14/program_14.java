import java.util.*;
class program_14{
public static void main(String args[]){

  int max=100;
    int min=1;
    int diff=max-min;
    Random rn = new Random();
    int i = rn.nextInt(diff+1);
    i+=min;
System.out.print("The Random number are :");
for(int j=1;j<=10;j++){
i++;
    System.out.print(" "+i);
}
}
}
