import java.util.Scanner;
import java.lang.*;

//import java.util.ArrayList;
class humaan{
//   public int n ;
    String[] name=new String[3];
    Integer[] age=new Integer[3];

    int i=0;
    void setName(String s) {
        name[i]=s;
        i++;
    }

    int j=0;
    void setAge(int s) {
        age[j]=s;
        j++;
    }
    public void display()
    {
        for (String s : name) {
            System.out.println("THE NAME OF HUMAN IS :" + s);
        }

        for (Integer integer : age) {
            System.out.println("THE age OF HUMAN IS :" + integer);
        }

    }
}


class child extends humaan{
    String[] gender = new String[4];
    String[] marital_status = new String[4];


    int i=0;
    void setGender(String s) {
        gender[i]=s;
        i++;
    }
    int j=0;
    void setMarital_status(String o) {
        marital_status[j]=o;
        j++;
    }

    public void display() {
        for (String s : name) {
            System.out.println("THE NAME OF HUMAN IS :" + s);
        }

        for (Integer integer : age) {
            System.out.println("THE age OF HUMAN IS :" + integer);
        }

        for (String s : gender) {
            System.out.println("THE GENDER OF HUMAN IS :" + s);
        }
        for (String maritalStatus : marital_status) {
            System.out.println("THE marital status IS :" + maritalStatus);
        }
    }

 }




public class QUESTION_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        child tushar =  new child();

        System.out.println("ENTER THE DETAILS OF THREE HUMANS :");
        int k =0;
        while (k<3) {

            String s , m, l;
            int pp;

            System.out.println("ENTER NAME OF CHILD");
            s=sc.next();


            System.out.println("ENTER AGE OF CHILD");
            pp=sc.nextInt();


            System.out.println("ENTER GENDER OF CHILD");
            m = sc.next();


            System.out.println("ENTER MARITAL STATUS OF CHILD");
            l= sc.next();

            tushar.setMarital_status(l);
            tushar.setName(s);
            tushar.setAge(pp);
            tushar.setGender(m);
            k++;
        }

        tushar.display();
    }





}



