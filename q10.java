import java.util.Scanner ;

public class q10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        
        System.out.println(" Enter marks in maths ");

        float a=sc.nextFloat();

        System.out.println(" Enter marks in Science  ");

        float b=sc.nextFloat();

        System.out.println(" Enter marks in English");

        float c=sc.nextFloat();

        float d = a+b+c;

        float e = d/300*100 ;

        System.out.println(" Total marks scored by the student is " + d);

        System.out.println(" Percentage marks is " + e + "%");
    }
    
}
