import java.util.Scanner;
class fact1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int num=sc.nextInt();
System.out.println("Enter a factorial: ");
int fact=sc.nextInt();
while(num>=1){
fact=num*fact1;
num--;
}
System.out.println(fact);
}
}