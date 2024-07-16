public class OddNo{

public static void main(String args[]){

 int a[]={1,2,3,4,5,6,7,8,9,10};
int ar[]=new int[a.length];
 
for(int i=0;i<a.length;i++){

if(a[i]%2!=0){
ar[i]=a[i];
}

}
System.out.println("ODD NUMBERS IN ARRAY");
for(int i=0;i<ar.length;i++){
if(ar[i]!=0){
System.out.print(ar[i]+" ");

}

}
System.out.println();
System.out.println("Sum of odd Number in Array");

int total=0;
for(int i=0;i<ar.length;i++){
if(ar[i]!=0){
total=total+ar[i];
}

}
System.out.println("TOTAL:"+ total);

}

}