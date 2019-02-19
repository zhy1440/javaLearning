package ProducterAndConsumer.Version2;

/**
 * 消费者
 *
 * @author ctk
 */

import java.util.List;

public class Consumer implements Runnable {
    private List<PCData> queue;

    public Consumer(List<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (Thread.currentThread().isInterrupted())
                    break;
                PCData data;
                synchronized (queue) {
                    if (queue.size() == 0) {
//                        System.out.println("before wait:" + queue.size());
//                        System.out.println("after wait:" + queue.size());
                        System.out.println(Thread.currentThread().getName()+" notifyAll()");
                        queue.notifyAll();
                        System.out.println(Thread.currentThread().getName()+" consumer wait()");
                        queue.wait();
                    }
                    data = queue.remove(0);
                }
                System.out.println(
                        Thread.currentThread().getId() + " 消费了:" + data.get() + " result:" + (data.get() * data.get()));
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

