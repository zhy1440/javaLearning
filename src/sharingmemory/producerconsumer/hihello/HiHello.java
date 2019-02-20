package sharingmemory.producerconsumer.hihello;

import java.util.concurrent.TimeUnit;

public class HiHello {
    static boolean S1 = false;

    public static void main(String[] args) {
        new Thread(new Thread1(), "Thread 1").start();
//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        new Thread(new Thread2(), "Thread 2").start();
    }

    private static class Thread1 implements Runnable {

        @Override
        public void run() {
            while (!HiHello.S1) {
                System.out.println(Thread.currentThread().getName() + ": " + HiHello.S1);
            }
            System.out.println("Hello!");
        }
    }

    private static class Thread2 implements Runnable {

        @Override
        public void run() {
            HiHello.S1 = true;
            System.out.println(Thread.currentThread().getName() + ": " + HiHello.S1);
            System.out.println("Hi!");
        }
    }
}
