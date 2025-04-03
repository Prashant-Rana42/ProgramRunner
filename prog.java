import java.util.*;
class prog{
public static void main(String[]ar){
Scanner sc = new Scanner(System.in);
int a = 0;
try{
new ProcessBuilder("cmd", "/c", "color A").inheritIO().start().waitFor();
while(a!=4){
System.out.println("____Options____\n1-Run program\n2-Program List\n3-Clear screen\n4-Exit\n");
a = sc.nextInt();
if(a==1){
System.out.println("Enter the name of program: ");
String s = sc.next();
new ProcessBuilder("cmd", "/c", "javac "+s+".java").inheritIO().start().waitFor();
new ProcessBuilder("cmd", "/c", "java "+s).inheritIO().start().waitFor();
}
else if(a==2){
new ProcessBuilder("cmd", "/c", "dir").inheritIO().start().waitFor();
}
else if(a==3){
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
}
else if(a==4){
System.out.println("Compiler stopped");
}
else{
System.out.println("Wrong input!");
}
}
new ProcessBuilder("cmd", "/c", "color 7").inheritIO().start().waitFor();
}catch(Exception e){
	System.out.println("Exception: "+e);
	main(new String[0]);
}
}
}