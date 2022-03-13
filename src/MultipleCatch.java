import java.util.InputMismatchException;
import java.util.Scanner;
//Exce
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,result;
        System.out.println("Enter the numerator and denominator");
        try
        {
            a=sc.nextInt();
            b=sc.nextInt();
            result=a/b;
            System.out.println("Result="+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Only numbers are accepted");
        }

    }
}
