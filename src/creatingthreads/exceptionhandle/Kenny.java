package creatingthreads.exceptionhandle;

import java.util.concurrent.TimeUnit;

public class Kenny implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world!");

        Thread currentThread = Thread.currentThread();

        while (!currentThread.isInterrupted()) {
            System.out.println("I'm still alive!");

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                currentThread.interrupt();
            }
        }

        throw new RuntimeException("Goodbye cruel World!");
    }
}
