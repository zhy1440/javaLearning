package java8learning.lambda.lambda;

public class RunnableLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello world from thread {" + Thread.currentThread().getName() + "}");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
