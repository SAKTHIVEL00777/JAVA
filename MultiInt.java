public class MultiInt{

public static void main(String args[]){

int no=5000;
int ar[]=new int[no];

for(int i=1;i<no;i++){
   if(i%200==0){
  ar[i]=i;
}

}
for(int i=1;i<no;i++){
if(ar[i]!=0){
System.out.print(ar[i]+" ");
}

}

}

}