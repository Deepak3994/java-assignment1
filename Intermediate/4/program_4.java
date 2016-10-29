import java.util.*;
public class program_4{  
 
public static void main(String[] args) {
 
String str="";
String revstring="";
Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a String: ");
        str = scanner.next();
 
for(int i=str.length()-1;i>=0;--i){
revstring +=str.charAt(i);
}
 
System.out.println(revstring);
 
if(revstring.equalsIgnoreCase(str)){

System.out.println("The string "+str+" is Palindrome");
}
else{
System.out.println("The string "+str+" is not Palindrome");
}
 
}
}
