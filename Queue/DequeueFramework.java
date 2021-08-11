import java.util.*;

class DequeueFramework {
    public static void main(String[] args) {

        // the dequeue can act like a queue as well as stack
        ArrayDeque<Integer> d1 = new ArrayDeque<>(10);

        // Here,It is acting like a stack LIFO
        d1.addLast(10);
        d1.addLast(20);
        d1.addLast(30);
        d1.addLast(40);
        d1.addLast(50);
        System.out.println("The value of array d1 is which is printing direct " + d1);

        // println with the help of foreach loop
        d1.forEach((x) -> System.out.println(x));

        d1.removeFirst();
        // after deleting the first element
        System.out.println("The value of array d1 after deleting 1st value " + d1);

        // ----------------------------------------------------------//
        ArrayDeque<Integer> d2 = new ArrayDeque<>(10);

        // Here,It is acting like a queue FIFO
        d2.addFirst(10);
        d2.addFirst(20);
        d2.addFirst(30);
        d2.addFirst(40);
        d2.addFirst(50);
        System.out.println("The value of array d2 is which is printing direct " + d2);

        // println with the help of foreach loop
        d2.forEach((x) -> System.out.println(x));

        d2.removeFirst();
        // after deleting the first element
        System.out.println("The value of array d1 after deleting 1st value " + d2);

    }
}