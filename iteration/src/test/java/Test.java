import priorityqueue.MyHeap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Test {

    @org.junit.Test
    public void test() {
        MyHeap<Integer> h = new MyHeap<>(100);
        h.add(1);
        h.add(-1);
        h.add(4);
        h.add(7);
        h.add(-9);
        h.add(10);
        Iterator<Integer> iterator = h.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------");
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(1);
        heap.add(-1);
        heap.add(4);
        heap.add(7);
        heap.add(-9);
        heap.add(10);
        Iterator<Integer> it = heap.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
