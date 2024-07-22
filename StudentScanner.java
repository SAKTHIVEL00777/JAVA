import java.util.Scanner;

public class StudentScanner{

public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
 
System.out.println("ENTER YOUR ID:");
int studentId =sc.nextInt();
System.out.println("STUDENTID:"+ studentId);
sc.nextLine();

System.out.println("ENTER YOUR FIRSTNAME:");
String firstName=sc.nextLine();
System.out.println("FIRSTNAME:"+ firstName); 

System.out.println("ENTER YOUR LASTNAME:");
String lastName=sc.nextLine();
System.out.println("LASTNAME:"+ lastName);

System.out.println("ENTER YOUR DOB:");
String dob=sc.nextLine();
System.out.println("DOB:"+ dob);

System.out.println("ENTER YOUR EMAIL:");
String email=sc.nextLine();
System.out.println("EMAIL:"+ email);

System.out.println("ENTER YOUR PASSWORD:");
int password=sc.nextInt();
System.out.println("PASSWORD:"+ password);
sc.nextLine();

System.out.println("ENTER YOUR MOBILENO:");
long mobile=sc.nextLong();
System.out.println("MOBILENO:"+ mobile);
sc.nextLine();

System.out.println("ENTER YOUR ADDRESS:");
String address=sc.nextLine();
System.out.println("ADDRESS:"+ address);

System.out.println("ENTER YOUR CITY:");
String city=sc.nextLine();
System.out.println("CITY:"+ city);

System.out.println("ENTER YOUR COUNTRY:");
String country=sc.nextLine();
System.out.println("COUNTRY:"+ country);

}

}