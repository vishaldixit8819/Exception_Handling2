public class Exceptionexample {
    public static void main(String[] args) {
        try
        {
            int a=10,b=0;
            int c=a/b;

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("End of the code");
    }
}
