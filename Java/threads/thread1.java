public class thread1 extends Thread {
    @Override
    public void start() {
        for (int i = 0; i < 20; i++)
            System.out.println("working in the 111111111");
    }
}

class thread2 extends Thread {
    @Override
    public void start() {
        for (int i = 0; i < 20; i++)
            System.out.println("working in the 22222");
    }
}