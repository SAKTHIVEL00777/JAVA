public class CountOfCharacter{

public static void main(String args[]){

String name="kavin kumar";

int count=0;
System.out.println("The enterted string is:"+ name);
for(int i=0;i<name.length();i++){

if(name.charAt(i)!=' ')
 count++;

}
System.out.println("Total No of char:"+ count);

}


}




