import java.util.Scanner ;

public class q7 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner( System.in);

        System.out.println(" Enter the first number ");

        int a = sc.nextInt();

        System.out.println(" Enter the second number ");

        int b = sc.nextInt();

        System.out.println(" Enter the third number ");

        int c = sc.nextInt();

        if (a==b && b==c)

    { System.out.println( " all the three numbers are equal");}

        else 

    { if (a==b || b==c || c==a )

    System.out.println( " atleast two out of the three numbers are equal");

    }
    
}
}
