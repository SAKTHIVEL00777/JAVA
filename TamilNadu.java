class TamilNadu extends SouthIndia{

static String capital="chennai";

TamilNadu(){
  super();
}
void speakLanguage(){
 System.out.println("TAMIL");
}
void eat(){
  System.out.println("BRIYANI");
}
void dress(){
  System.out.println("T-SHIRTS");
}
void cultivate(){
 System.out.println("Rice and Sugar cane cultivation");
}
void livingStyle(){
  System.out.println("Above Average Devlopment");
}

public static void main(String args[]){

  SouthIndia si=new TamilNadu();
  System.out.println(India.capital);
  System.out.println(TamilNadu.capital);
      si.speakLanguage();
      si.eat();
      si.dress();
      si.cultivate();
      si.livingStyle();
}
}
