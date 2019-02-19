package threadlearning.runstart;

// Demo.java 的源码
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
};

public class Demo {
    public static void main(String[] args) {
        Thread myThread = new MyThread("mythread");

        System.out.println(Thread.currentThread().getName() + " call myThread.run()");
        myThread.run();

        System.out.println(Thread.currentThread().getName() + " call myThread.start()");
        myThread.start();
    }
}