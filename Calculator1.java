public class Calculator1{

public static void main(String args[]){
    
   Calculator1 cal=new Calculator1();

    System.out.println("WITHOUT PARAMETER WITHOUT RETURN");
       cal.add();
       cal.sub();
       cal.multi();
       cal.div();
       cal.mod();

}
public void add(){
  
   System.out.println("ADD:"+(25+10));
}
public void sub(){

   System.out.println("SUB:"+(25-17));
}
public void multi(){

   System.out.println("MULTI:"+(25*7));
}
public void div(){

   System.out.println("DIV:"+(25/5));
}
public void mod(){

   System.out.println("MOD:"+(21%3));
}

}