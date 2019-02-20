package creatingthreads.helloworld;

public class RealHelloWorldRunnableWithSleep {
    public static class Greeter implements Runnable {
        private String country;

        public Greeter(String country) {
            this.country = country;
        }

        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long id = Thread.currentThread().getId();
            System.out.println(id + ": Hello " + country + "!");

        }
    }

    public static void main(String[] args) {
        String countries[] = {"France", "India", "China", "USA", "Germany"};
        for (String country : countries) {
            // Must call start() not run() to create a thread!!!
            Greeter greeter = new Greeter(country);
            new Thread(greeter, country + " thread").start();
        }
    }
}
