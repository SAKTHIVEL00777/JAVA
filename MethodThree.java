public class MethodThree{

public static void main(String args[]){
 
  MethodThree mth=new MethodThree();

 int x= mth.multi(77,66);
 
  System.out.println("With Parameter With Return");
  System.out.println(x);

}
public static int multi(int a,int b)
{

 int c=a*b;
 return c; 
}
}