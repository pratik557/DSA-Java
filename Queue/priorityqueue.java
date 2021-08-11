import java.util.*;

class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> s1 = new PriorityQueue<>();
        s1.add(30);
        s1.add(10);
        s1.add(20);
        s1.add(5);
        s1.add(15);
        s1.add(3);

        System.out.println("The 1st element of the queue is " + s1.peek());
        System.out.println("The element inside the queue are ");
        s1.forEach((n) -> System.out.println(n));
        System.out.println("The element inside the queue after deletion ");
        s1.poll();
        s1.forEach((n) -> System.out.println(n));

    }
}