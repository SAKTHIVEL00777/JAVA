package tamilnadu.chennai;

class CommonManInChennai implements TrafficRulesChennai{

public void goByDieselVehicle(){
  System.out.println("Diesel Vehicle");
}
public void goByBicycle(){
  System.out.println("Bicycle");
}
public static void main(String args[]){
  
  CommonManInChennai cmc=new CommonManInChennai();
   System.out.println(cmc.trafficCommisssioner);
     cmc.goByDieselVehicle();
     cmc.goByBicycle();
}

}
