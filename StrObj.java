public class StrObj{

public static void main(String args[]){

String s="cricket";
String ss="cricket";
String sss="footbaal";

System.out.println(s==ss);
System.out.println("=====================");
System.out.println("LITERAL WAY");
System.out.println(s.hashCode());
System.out.println(ss.hashCode());
System.out.println(sss.hashCode());

System.out.println("=====================");
System.out.println("NEW KEYWORD WAY");
String s1=new String("cricket");
String s2=new String("cricket");
System.out.println(s1==s2);

}

}