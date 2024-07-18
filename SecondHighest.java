public class SecondHighest{

public static void main(String args[]){

int ar[]={15,10,25,20};
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
for(int i=0;i<ar.length;i++)
{
  System.out.print( ar[i]+" ");

}
System.out.println();
  System.out.print("SECOND HIGHEST NO:"+ ar[ar.length-2]);


}


}