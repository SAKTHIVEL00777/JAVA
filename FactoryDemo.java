abstract class FactoryDemo extends SmartPhone{

boolean isOriginalPiece=false;
static int price=0;

abstract void verifyFingerPrint();
abstract void providePattern();

int call(int seconds){
 return seconds;
}
void sendMessage(){
  System.out.println("SmartPhone Send Message");
}
void receiveCall(){
  System.out.println("SmartPhone Receive Call");
}

void browse(){
 System.out.println("Factory Demo Browsing");
}

}

