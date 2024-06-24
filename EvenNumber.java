public class EvenNumber{

public static void main(String args[]){

System.out.println("FOR LOOP");
for(int i=1;i<=500;i++){

 if(i%2==0){
System.out.println(i);
}
    }

System.out.println("WHILE LOOP");
int i=1;
while(i<=500){
 if(i%2==0){
  System.out.println(i);
}
i++;
}
System.out.println("DO WHILE LOOP");
int j=1;
do{
  if(j%2==0){
   System.out.println(j);
}
j++;
}while(j<=500);
  
}

}