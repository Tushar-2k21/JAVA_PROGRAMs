class thread1 extends Thread {

    thread1(String s)
    {
        super(s);

    }
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I AM COOKING ");
            System.out.println("I AM happy ");
            i++;
        }

    }
}
class thread2 extends Thread {
    thread2(String s)
    {
        super(s);

    }
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I AM CHATTING ");
            System.out.println("I AM SAD ");
            i++;
        }

    }
}


public class Threads {
    public static void main(String[] args) {
        thread1 t1 = new thread1("tushar");
        thread2 t2 = new thread2("harry");
        t1.start();
        t2.start();
        System.out.println("the name is " + t1.getId());
        System.out.println("the name is " + t1.getName());
        System.out.println("the name is " + t2.getId());
        System.out.println("the name is " + t2.getName());

     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(Thread.MAX_PRIORITY);

//        String s = "TUSHAR"
//        System.out.println(s.lastIndexOf("S" , 0));




    }
}