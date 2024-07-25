public class DuplicateChar{

public static void main(String args[]){

String str="kavin kumar";

char[] name=str.toCharArray();

System.out.println("The String is:" + str);
System.out.println("Duplicate Character is: ");

for(int i=0;i<str.length();i++){

  for(int j=i+1;j<str.length();j++){

   if(name[i]==name[j]){

    System.out.print(name[j]+ " ");

   
  
}

}

}

}

}