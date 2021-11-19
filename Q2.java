import java.util.Scanner ;
public class Q2
{

public static void main(String[] args) 

{
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter the two sides of the rectangle");
     double a= sc.nextDouble();
     double b= sc.nextDouble();

    int c = (int) (a*b);
     

  
     System.out.println(" The area of the rectangle is ="+ c);
}
}
