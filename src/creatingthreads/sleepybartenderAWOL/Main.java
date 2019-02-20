package creatingthreads.sleepybartenderAWOL;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Bartender bartender = new Bartender();
        Thread bartenderThread = new Thread(bartender, "Bartender");
        bartenderThread.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
        int numCustomers = 5;

        Thread[] customerThreads = new Thread[numCustomers - 1];
        for (int i = 1; i < numCustomers; i++) {
            String customerName = "Customer " + i;
            Customer customer = new Customer(bartenderThread, customerName, (int) (Math.random() * 10));

            customerThreads[i - 1] = new Thread(customer, customerName);
            customerThreads[i - 1].start();
        }

        try {
            bartenderThread.join();
        } catch (InterruptedException e) {
        }
        System.out.println("A voice: Hey Isn't that the bartender sneaking out the door?");

        for (int i = 1; i < numCustomers; i++) {
            customerThreads[i - 1].interrupt();
        }
        for (int i = 1; i < numCustomers; i++) {

            try {
                customerThreads[i - 1].join();
            } catch (InterruptedException e) {
            }
            System.out.println("customerThreads " + i + " finished");

        }
    }

}
