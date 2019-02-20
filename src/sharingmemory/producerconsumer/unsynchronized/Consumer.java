package sharingmemory.producerconsumer.unsynchronized;

public class Consumer implements Runnable {
    private Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {

        System.out.println("Consumer starting");

        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Produce produce = producer.getLatestProduce();

            if (produce != null) {
                int produceInstance = produce.getInstance();
                Produce.Color color = produce.getColor();

                System.out.println("Last produce instance: " + produceInstance);
                System.out.println("Last produce color: " + color.name());

                if (produceInstance == 10) {
                    break;
                }

            }
        }
    }
}
