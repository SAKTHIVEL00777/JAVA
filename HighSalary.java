public class HighSalary{

public static void main(String args[]){
 
  int ram=5000;
  int karthik=3000;
  int guru=8000;
  int kumar=9000;
  int prabhu=4000;
 System.out.println("======================");

if((ram>karthik)&&(ram>guru)&&(ram>kumar)&&(ram>prabhu)){
    System.out.println("RAM is highest salary");
}
else if((karthik>ram)&&(karthik>guru)&&(karthik>kumar)&&(karthik>prabhu)){
    System.out.println("KARTHIK is highest salary");
}
else if((guru>ram)&&(guru>karthik)&&(guru>kumar)&&(guru>prabhu)){
    System.out.println("GURU is highest salary");
}
else if((kumar>ram)&&(kumar>karthik)&&(kumar>guru)&&(kumar>prabhu)){
    System.out.println("KUMAR is highest salary");
}
else if((prabhu>ram)&&(prabhu>karthik)&&(prabhu>guru)&&(prabhu>kumar)){
    System.out.println("PRABHU is highest salary");
}
    System.out.println("======================");

}

}