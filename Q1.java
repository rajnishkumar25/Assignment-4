import java.util.Scanner ;
public class Q1
{

public static void main(String[] args) 

{
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter the two integers");
     int a= sc.nextInt();
     int b= sc.nextInt();

     int c = a+b;
     int d = a*b ;

     System.out.println(" The sum of the two integers is ="+ c);
     System.out.println(" The product of the two integers is ="+ d);
}
}