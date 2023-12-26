public class NestedDoWhileLoop{

public static void main(String args[]){

      int i=0;
      do{
           int j=0;
           do{
               System.out.print(j);
              j++;
              //System.out.println("i: "+ i +",j:" + j);
            }while(j<3);
        System.out.println(i);
        i++;
   
      }while(i<3);
}

}