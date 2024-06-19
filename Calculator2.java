public class Calculator2{

public static void main(String args[]){

    Calculator2 ss=new Calculator2();

    System.out.println("WITH PARAMETER & WITHOUT RETURN");
        ss.add(35,12);
        ss.sub(64,25);
        ss.multi(10,7);
        ss.div(80,8);
        ss.mod(72,9);
}

public void add(int a, int b){
  
  int c=a+b;
  System.out.println("ADD:"+ c);
 
}
public void sub(int e, int f){
  
  int d=e-f;
  System.out.println("SUB:"+ d);
}
public void multi(int g, int h){
  
  int i=g*h;
  System.out.println("MULTI:"+ i);
}
public void div(int j, int k){
  
  int l=j/k;
  System.out.println("DIV:"+ l);
}
public void mod(int o, int p){
  
  int q=o%p;
  System.out.println("MOD:"+ q);
}



}