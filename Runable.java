class threead1 implements Runnable {
    @Override
    public void run(){
        int i = 0;
        while (i < 1000) {
            System.out.println("I AM COOKING ");
            System.out.println("I AM happy ");
            i++;
        }

    }
}
class threead2 implements Runnable {

    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I AM CHATTING ");
            System.out.println("I AM SAD ");
            i++;
        }

    }
}

public class Runable{
    public static void main(String[] args) {
        threead1 bullet1 = new threead1();
        threead2 bullet2 = new threead2();
        Thread t1 = new Thread(bullet1);
        Thread t2 = new Thread(bullet2);
        t1.start();
        t2.start();

    }
}
