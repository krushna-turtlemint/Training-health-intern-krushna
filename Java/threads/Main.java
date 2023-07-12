class Runnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
            System.out.println("Runnin in the one thread 10101010");
    }

}

class Runnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
            System.out.println("Runnin in the one thread 222");
    }

}

public class Main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
        Runnable1 myRunnable = new Runnable1();
        Thread thread = new Thread(myRunnable);
        Runnable2 myRunnable2 = new Runnable2();
        Thread thread2 = new Thread(myRunnable2);
        thread.start();
        thread2.start();
    }

}
