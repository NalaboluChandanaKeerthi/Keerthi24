import java.util.Scanner;
class Eligible1{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the below inputs:");
String qual=input.next();
System.out.println("Enter the percentage");
int percent=input.nextInt();
System.out.println("Enter the year");
int year=input.nextInt();
System.out.println("Enter the skills");
String skills=input.next();
System.out.println("Enter exam");
String exam=input.next();
int fee=25000;
int discount=20000;
if((qual.equals("b.tech")||qual.equals("MCA")||qual.equals("M.tech")) && (percent>=60) && (year==2023 ||year==2024) &&(skills.equals("java")||skills.equals("python")) &&(exam.equals("qualify")))
{
 fee=fee-discount;
 System.out.println(fee);
 System.out.println("Eligible");
}
else{
 System.out.println("Not Eligible");
}
}
}