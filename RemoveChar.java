import java.util.Scanner;

public class RemoveChar{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the name:");
String name=sc.nextLine();
System.out.println("Entre the char delete:");
String delete=sc.nextLine();
		
String str=name.replace(delete,"");
System.out.println(str);
		
}

}