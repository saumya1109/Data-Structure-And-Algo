import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Employee> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    public void add(Employee e) {
        queue.addLast(e);

    }

    public void remove() {
        queue.removeFirst();
    }

    public Employee peek() {
        return queue.peek();

    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printQueue() {
        Iterator<Employee> itr = queue.iterator();
        {
            while (itr.hasNext()) {
                System.out.println(itr.next());

            }
        }
    }
}
