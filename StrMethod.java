public class StrMethod{

public static void main(String args[]){

String s="beautiful";
String ref="nature";

System.out.println(s.length());
System.out.println(s.charAt(3));
System.out.println(s.indexOf("t"));
System.out.println(s.equals("beauty"));
System.out.println(s.equalsIgnoreCase("Beautiful"));
System.out.println(s.isEmpty());
System.out.println(s.concat("EYES"));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.trim());
System.out.println(s.startsWith("bea"));
System.out.println(s.endsWith("ul"));
System.out.println(s.valueOf(s));
System.out.println(s.replace("beautiful","NATURE"));
System.out.println(s);
System.out.println(s.replaceAll("beautiful","WONDERFUL"));
System.out.println(s);
System.out.println(s.split("i"));
System.out.println(s.hashCode());
System.out.println(s.intern());
System.out.println(s.format("NATURE"));
System.out.println(s.compareTo("guys"));
System.out.println(s.compareToIgnoreCase(ref));
System.out.println(s.contains("be"));
System.out.println(s.codePointAt(6));

}

}