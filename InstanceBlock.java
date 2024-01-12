public class InstanceBlock{

static{
  System.out.println("STATIC 1st BLOCK");
}

{
   System.out.println("INSTANCE 1st BLOCK");
}

static{
  System.out.println("STATIC 2nd BLOCK");
}

{
   System.out.println("INSTANCE 2nd BLOCK");
}


public static void main(String args[]){

 System.out.println("MAIN BLOCK");

  InstanceBlock ib=new InstanceBlock();

}

}