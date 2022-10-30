class Samsung extends FactoryDemo {

static int price=5000;

 void verifyFingerPrint(){
  System.out.println("Fingerprint Verified");
}
 void providePattern(){
   System.out.println("Pattern Lock");
}

public static void main(String args[]){

   Samsung sam=new Samsung();
    sam.browse();
   System.out.println(sam.price);
   sam.verifyFingerPrint();
   sam.providePattern();
   System.out.println(sam.call(5)+ "seconds");
   sam.sendMessage();
   sam.receiveCall();

}



}
