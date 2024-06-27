public class HumanMain{

public static void main(String args[]){
  
  Human hm=new Human();

  System.out.println("HUMAN CLASS METHOD CALLING FOR HUMANMAIN CLASS");
   hm.run();
   hm.walk();
   hm.sleep();
   hm.eat();
   hm.study();
}

}
class Human{

public void run(){

  System.out.println("DAILY MORNING 2 HOURS RUNNING");
}
public void walk()
{
  System.out.println("DAILY MORNING 3 HOURS WALKING");
}
public void sleep()
{
  System.out.println("DAILY NIGHT 8 HOURS SLEEPING");
}
public void eat()
{
  System.out.println("DAILY 3 TIMES EATING");
}
public void study()
{
  System.out.println("I AM STUDY WIT MY FAVORITE SUBJECT MATHS");
}


}





