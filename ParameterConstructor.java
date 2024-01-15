public class ParameterConstructor{

public ParameterConstructor(int custid,String name,long phoneno){

 System.out.println("PARAMETER CONSTRUCTOR");
 System.out.println("CUSTID:"+ custid);
 System.out.println("NAME:"+ name);
 System.out.println("PHONENO:"+ phoneno);

}
public static void main(String args[]){

  ParameterConstructor pc=new ParameterConstructor(1,"saka",8764723412L);
  System.out.println("==============================");
  ParameterConstructor pc1=new ParameterConstructor(2,"guru",8764723421L);
}

}