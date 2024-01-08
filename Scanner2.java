import java.util.Scanner;

public class Scanner2{

public static void main(String args[]){

  Scanner sc=new Scanner(System.in);

System.out.println("ENTER YOUR NAME");
String name=sc.nextLine();
System.out.println("NAME:"+ name);

System.out.println("ENTER YOUR AGE");
int age=sc.nextInt();
System.out.println("AGE:"+ age);
sc.nextLine();

System.out.println("ENTER YOUR EMAIL");
String email=sc.nextLine();
System.out.println("EMAIL:"+ email);

System.out.println("ENTER YOUR DEGEREE");
String deg=sc.nextLine();
System.out.println("DEGEREE:"+ deg);

System.out.println("ENTER YOUR MOBILE NO");
Long mob=sc.nextLong();
System.out.println("MOBILE NO:"+ mob);
sc.nextLine();

System.out.println("ENTER YOUR COLLEGE");
String college=sc.nextLine();
System.out.println("COLLEGE:"+ college);

System.out.println("ENTER YOUR CITY");
String city=sc.nextLine();
System.out.println("CITY:"+ city);

System.out.println("THANK YOU VISIT THE BIO DATA");
  
}

}