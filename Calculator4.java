public class Calculator4{

public static void main(String args[]){

   Calculator4 cc=new Calculator4();
    int c=cc.add(76,82);
    int s=cc.sub(88,65);
    int r=cc.multi(65,5);
    int t=cc.div(110,9);
    int u=cc.mod(67,4);

   System.out.println("WITH PARAMETER & WITH RETURN");
   System.out.println("ADD:"+ c);
   System.out.println("SUB:"+ s);
   System.out.println("MULTI:"+ r);
   System.out.println("DIV:"+ t);
   System.out.println("MOD:"+ u);

}
public int add(int x,int y){

int z=x+y;
return z;
}
public int sub(int m,int n){

int k=m-n;
return k;
}
public int multi(int e,int f){

int d=e*f;
return d;
}
public int div(int p,int q){

int y=p/q;
return y;
}
public int mod(int a,int b){

int c=a%b;
return c;
}


}