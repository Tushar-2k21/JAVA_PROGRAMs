import java.util.Scanner;

class except extends Exception{
    @Override
     public String toString()
    {
        return " I AM TO STRING MESSAGE";
     }
//    @Override
    public String GetMessage()
    {
        return " I AM TO get MESSAGE";
    }

}
class add {
    public void addd(int x, int y) throws ArithmeticException{
        System.out.println("the is sum: ");

        System.out.println(x / y);

    }
}




public class exception{
    public static void main(String[] args) {

        int a ;
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
        if (a < 9) {
            try {
                int c = 45/a;
                throw new except();

            } catch (Exception ee) {
                System.out.println(ee.getMessage());
            }
        }
        add ii = new add();
//        throws
        try{
            int k , b;
            k = sc.nextInt();
            b = sc.nextInt();
            ii.addd(k,b);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


}
