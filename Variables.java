public class Variables{

int x=27;
int y=39;

static int s=77;
static String str="kavin"; 

public static void main(String args[]){

int a=15;
System.out.println("LOCAL VARIABLE");
System.out.println("Value of A:"+ a);
System.out.println("=======================");

  Variables vb=new Variables();

   int b=vb.x;
   int c=vb.y;
   String ss="sakthi";

System.out.println("INSTANCE VARIABLE & GLOBAL VARIABLE");
System.out.println("Value of b:"+ b);
System.out.println("Value of c:"+ c);
System.out.println("My Name:"+ ss);
System.out.println("=======================");

System.out.println("STATIC VARIABLE & CLASS VARIABLE");
System.out.println(s);
System.out.println(str);

}


}