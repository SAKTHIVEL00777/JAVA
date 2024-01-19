public class StrBuilder{

public static void main(String args[]){

StringBuilder sb=new StringBuilder("java");
System.out.println(sb);

System.out.println(sb.hashCode());

System.out.println(sb.length());

sb.append("program");
System.out.println(sb);

sb.insert(4,"hello");
System.out.println(sb);

sb.delete(0,3);
System.out.println(sb);

sb.reverse();
System.out.println(sb);
}

}