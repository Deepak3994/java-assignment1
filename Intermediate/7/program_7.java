
import java.util.*;
public class program_7{
public static void main(String args[]){

String s;
String var;
System.out.println("Enter a string: ");
Scanner sc=new Scanner(System.in);
s=sc.next();
System.out.println("The resverse string is: ");
  for(int i=s.length()-1;i>=0;i--){
   var= Character.toString(s.charAt(i));
    System.out.print(var);
  }
}
}
