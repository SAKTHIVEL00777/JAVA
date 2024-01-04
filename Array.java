public class Array{

public static void main(String args[]){

 int ar[]=new int[5];

ar[0]=10;
ar[1]=20;
ar[2]=30;
ar[3]=40;
ar[4]=50;

System.out.println("ARRAY VALUE:"+ ar[0]);

System.out.println("ARRAY VALUE:"+ ar[2]);

System.out.println("ARRAY VALUE:"+ ar[4]);

//System.out.println(ar[5]);     //==>ArrayIndexOutOfBoundsException

System.out.println("=======================");

for(int i=0;i<5;i++){

System.out.println("ARRAY VALUE IS:"+ ar[i]);

}

}


}