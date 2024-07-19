public class SecondSmall{

public static void main(String args[]){

int ar[]={3,7,6,9};

int temp=0;

for(int i=0;i<ar.length;i++){
    for(int j=i+1;j<ar.length;j++){

    if(ar[i]>ar[j]){

   temp=ar[i];
   ar[i]=ar[j];
   ar[j]=temp;
}

   }
}
for(int i=0;i<ar.length;i++){
  System.out.print(ar[i]+" ");
}
System.out.println();
System.out.println("SECOND SMALLEST NO:"+ ar[1]);

}


}