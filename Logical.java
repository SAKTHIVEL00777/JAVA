public class Logical{

public static void main(String args[]){

int a=35;
int b=25;

System.out.println("AND OPERATOR");
System.out.println(a>b && b<a);
System.out.println(a>b && b>a);
System.out.println(a<b && b<a);
System.out.println("======================");

System.out.println("OR OPERATOR");
System.out.println(a>b || b<a);
System.out.println(a>b || b>a);
System.out.println(a<b || b>a);
System.out.println("======================");

boolean x=false;
boolean y=true;

System.out.println("NOT OPERATOR");
System.out.println(!x);
System.out.println(!y);
}

}