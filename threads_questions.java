import jdk.swing.interop.SwingInterOpUtils;

class threed1 extends Thread{

   @Override
   public void run()
    {
//       Q4 for comment
//        for(int i =0;i<1000;i++) {
//            try {
//                threed1.sleep(200);
//            } catch (InterruptedException e) {
//                System.out.println("ERROR");
//            }
//            System.out.println("GOOD MORNING");
//        }
    }
}

class threed2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                threed1.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("ERROR");
            }
            System.out.println("WELCOME");
        }
    }

}


public class threads_questions {
    public static void main(String[] args) {

        threed1 t1 = new threed1();
        threed2 t2 = new threed2();

//        Q3

//        priority cannot be set more than 10
//
//        t1.setPriority(8);
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());

//                Q2
//         t1.setPriority(Thread.MAX_PRIORITY);
//         t2.setPriority(Thread.MIN_PRIORITY);

//        t1.setPriority((Thread.NORM_PRIORITY));


//        System.out.println(t1.getState());  NEW STATE
          t1.start();
//        t2.start();

//        Q4
//        System.out.println(t1.getState());   RUNNABLE STATE
        System.out.println(Thread.currentThread().getState());



    }
}
