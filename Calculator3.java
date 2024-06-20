public class Calculator3{

public static void main(String args[]){
 
   Calculator3 tt=new Calculator3();
   int s=tt.add();
   int ss=tt.sub();
   int x=tt.multi();
   int y=tt.div();
   int z=tt.mod();

   System.out.println("WITHOUT PARAMETER & WITH RETURN");
   System.out.println("ADD:"+ s);
   System.out.println("SUB:"+ ss);
   System.out.println("MULTI:"+ x);
   System.out.println("DIV:"+ y);
   System.out.println("MOD:"+ z);

}
public int add(){
 
int a=8;
int b=7;
int c=a+b;

return c;

}
public int sub(){
 
int a=8;
int b=7;
int c=a-b;

return c;

}
public int multi(){
 
int a=8;
int b=7;
int c=a*b;

return c;

}
public int div(){
 
int a=8;
int b=2;
int c=a/b;

return c;

}
public int mod(){
 
int a=34;
int b=3;
int c=a%b;

return c;

}




}