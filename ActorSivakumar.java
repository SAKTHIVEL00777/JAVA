class ActorSivakumar implements Actor{

static String address="Coimbatore";

void speaking(){
  System.out.println("speaking constructor");
}
public void act(){
  System.out.println("Acting");
}
public void dance(){
  System.out.println("Dancing");
}
public void sing(){
  System.out.println("Singing");
}
ActorSivakumar(){

}
ActorSivakumar(int age ,String car){
  System.out.println("AGE:" + age);
  System.out.println("CAR:" + car);
}
public static void main(String args[])
{
  ActorSivakumar as=new ActorSivakumar(65,"Audi Car");
   as.act();
   as.dance();
   as.sing();
   as.speaking();
 System.out.println(as.address);
 Actor ac=new ActorSivakumar();
   ac.act();
   ac.dance();
   ac.sing();
}
}
