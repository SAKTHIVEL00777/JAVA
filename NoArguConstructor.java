public class NoArguConstructor{

int studid;        //====>declare
String name;
String city;
double salary;

public NoArguConstructor(){

   studid=7;       //=====>initilization
   name="DHONI";
   city="Ranchi";
   salary=500000;

}
public static void main(String args[]){

 NoArguConstructor nac=new NoArguConstructor();

 System.out.println("NO ARGUMENT PARAMETER");
 System.out.println("STUDID:"+ nac.studid);
 System.out.println("NAME:"+ nac.name);
 System.out.println("CITY:"+ nac.city);
 System.out.println("SALARY:"+ nac.salary);

}

}