public class DefaultConstructor{

int staffid;
String name;
long mobileno;
double amount;

public static void main(String args[]){

 DefaultConstructor dc=new DefaultConstructor();

 System.out.println("DEFAULT CONSTRUCTOR");

 System.out.println("STAFFID:"+ dc.staffid); 
 System.out.println("NAME:"+ dc.name);
 System.out.println("MOBILENO:"+ dc.mobileno);
 System.out.println("AMOUNT:"+ dc.amount);

}

}