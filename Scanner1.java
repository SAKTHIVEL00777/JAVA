import java.util.Scanner;

public class Scanner1{

public static void main(String args[]){

  Scanner sc= new Scanner(System.in);

System.out.println("WELCOME TO STATE BANK!");

System.out.println("Enter Your Pin:");
int pin=sc.nextInt();
System.out.println("PIN:"+ pin);

sc.nextLine();

System.out.println("Please Enter Your Account:");
String acty=sc.nextLine();
System.out.println("ACCOUNT TYPE:"+ acty);

System.out.println("Please Enter Your Amount:");
double amt=sc.nextDouble();
System.out.println("AMOUNT:"+ amt);

System.out.println("THANKS!!!!VISIT AGAIN");
}

}