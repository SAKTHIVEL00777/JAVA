public class StrBuffer{

public static void main(String args[]){

StringBuffer sb=new StringBuffer("JAVA");
System.out.println(sb);

System.out.println(sb.hashCode());

System.out.println(sb.length());

sb.append("PROGRAM");
System.out.println(sb);

sb.insert(4,"HI");
System.out.println(sb);

sb.delete(0,4);
System.out.println(sb);

sb.reverse();
System.out.println(sb);

}

}