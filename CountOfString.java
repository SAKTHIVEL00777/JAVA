public class CountOfString{

public static void main(String args[]){

String var="Welcome To Techymeet";
int count=0;
for(int i=0;i<var.length();i++){
			
if(var.charAt(i)!=' ')
count++;

}

System.out.println("Total Number of string is:"+ count);

}

}