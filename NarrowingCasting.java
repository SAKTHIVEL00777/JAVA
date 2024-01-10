public class NarrowingCasting{

public static void main(String args[]){

double d=126.7;
float f=(float)d;
System.out.println("DOUBLE VALUE:"+ d);
System.out.println("FLOAT VALUE:"+ f);
System.out.println("========================");

long l=(long)f;
int i=(int)l;
System.out.println("LONG VALUE:"+ l);
System.out.println("INT VALUE:"+ i);
System.out.println("========================");

short s=(short)i;
byte b=(byte)s;
System.out.println("SHORT VALUE:"+ s);
System.out.println("BYTE VALUE:"+ b);
System.out.println("========================");

}

}