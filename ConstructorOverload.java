public class ConstructorOverload{

ConstructorOverload(){

 System.out.println("NO ARGUMENTS PASSING");
}
ConstructorOverload(int x){
 
 System.out.println(x);
}
ConstructorOverload(int x,String name){

  System.out.println(x+" "+name);

}
public static void main(String args[]){

ConstructorOverload co=new ConstructorOverload();

ConstructorOverload co1=new ConstructorOverload(7);

ConstructorOverload co2=new ConstructorOverload(10,"MESSI");

}

}