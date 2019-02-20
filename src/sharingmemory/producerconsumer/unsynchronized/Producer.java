package sharingmemory.producerconsumer.unsynchronized;

public class Producer implements Runnable {
    private Produce latestProduce = null;

    public Produce getLatestProduce() {
        return latestProduce;
    }

    @Override
    public void run() {
        System.out.println("Producer starting");

        Produce produce = new Produce();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            produce.setInstance(i);
            produce.setColor(Produce.Color.values()[i % Produce.Color.values().length]);
            latestProduce = produce;
        }

        System.out.println("Producer terminating");
    }
}
