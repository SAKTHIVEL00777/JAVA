public class MergeArray{

public static void main(String args[]){

 int arr1[]={100,90,80,70,60}; 

 int arr2[]={50,40,30,20,10};

 int merge=arr1.length+arr2.length;
 
 int arr3[]=new int[merge];

 int x=0;

for(int i=0;i<arr1.length;i++){

 arr3[x]=arr1[i];
x++;
}
for(int i=0;i<arr2.length;i++){

 arr3[x]=arr2[i];
x++;
}
for(int i=0;i<arr3.length;i++){

System.out.print(arr3[i]+" ");
}



}

}