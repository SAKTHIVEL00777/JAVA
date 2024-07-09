public class AddArray{

public static void main(String args[]){
 
  int arr1[]={90,80,70,60,50,40,30,20,10};
 
  int arr2[]=new int[arr1.length];

 System.out.println("ARRAY VALUE");
 for(int i=0;i<arr1.length;i++){

  System.out.print(arr1[i]+" ");
 
  }
System.out.println();
 for(int i=0;i<arr1.length;i++){
  arr2[i]=arr1[i];
 
  }

 System.out.println("COPY ARRAY VALUE");
for(int i=0;i<arr2.length;i++){
 
  
  System.out.print(arr2[i]+" ");
  }
 

}

}