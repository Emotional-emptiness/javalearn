package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDequeue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("alex");
        queue.add("petro");
        queue.add("andrew");
        queue.add("oleh");
        queue.offer("taras");

        System.out.println("before changes " + queue);

        String remove = queue.remove();
        System.out.println("After remove " + remove + " " + queue);

        String poll = queue.poll();
        System.out.println("After poll " + poll + " " + queue);
    }
}
