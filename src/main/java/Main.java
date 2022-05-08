import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup mainGroup =new ThreadGroup("main group");

        Thread myThread1 = new Thread(mainGroup,new MyThread(),"Поток 1");
        myThread1.setName("Поток 1");
        myThread1.start();

        Thread myThread2 = new Thread(mainGroup,new MyThread(),"Поток 2");
        myThread2.start();

        Thread myThread3 = new Thread(mainGroup,new MyThread(),"Поток 3");
        myThread3.start();

        Thread myThread4 = new Thread(mainGroup,new MyThread(),"Поток 4");
        myThread4.start();

        //long t= System.currentTimeMillis();
        //long end = t+15000;
        //while(System.currentTimeMillis() < end) {
        // {}
        //}
        Thread.sleep(10000);

        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}