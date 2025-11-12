package Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        // Thread safe and unbounded blocking queue
        // Elements can only be taken from the queue when the delay has expired
        // Useful for taks scheduling that are going to be executed after certain delay
        // it internally uses priority queue

        BlockingQueue<DelayedTask> delayQueue = new DelayQueue<>();

        delayQueue.put(new DelayedTask("Task 1", 5, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task 2", 3, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task 1", 10, TimeUnit.SECONDS));

        while (!delayQueue.isEmpty()) {
            DelayedTask task = delayQueue.take();
            System.out.println("Executed :: "+task.getTaksName()+ " at "+System.currentTimeMillis());
        }



    }
}

class DelayedTask implements Delayed{

    private final String taksName;
    private final long startTime;

    public DelayedTask(String taskName, long delay, TimeUnit unit){
        this.taksName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }
    

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayedTask) o ).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedTask) o ).startTime) {
            return 1;
        }

        return 0;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    public String getTaksName() {
        return taksName;
    }

}
