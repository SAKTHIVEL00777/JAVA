public class MethodOne{

public static void main(String args[]){

  MethodOne mo=new MethodOne();
  mo.add(22,11);
}

public void add(int p,int q){

System.out.println("With Parameter Without Return");

System.out.println("Value of P:"+ p);

System.out.println("Value of Q:"+ q);

int r=p+q;
System.out.println("Value of R:"+ r);


}

}