abstract class SmartPhone{

abstract int call(int seconds);
abstract void sendMessage();
abstract void receiveCall();

void browse(){
  System.out.println("SmartPhone Browsing");
}
public SmartPhone(){
 System.out.println("SmartPhone Under Development");
}
}
