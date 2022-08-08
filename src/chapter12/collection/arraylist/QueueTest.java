package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        if (arrayQueue.size() == 0) {
            System.out.println("큐가 비었습니다");
            return null;
        }

        return arrayQueue.remove(0);
    }

    public String peek() {
        if (arrayQueue.size() == 0) {
            System.out.println("큐가 비었습니다");
            return null;
        }

        return arrayQueue.get(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.peek());

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
