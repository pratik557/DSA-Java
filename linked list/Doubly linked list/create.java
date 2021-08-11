import java.util.*;

class create {
    public static void main(String[] args) {
        LinkedList<Integer> s1 = new LinkedList<>(); // for compile time input
        LinkedList<Integer> s2 = new LinkedList<>(List.of(40, 50, 60, 10, 70));
        System.out.println("The linkedlist value are given as ");
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.addAll(1, s2);
        s1.set(6, 100);// it will replace the value of 6th index with 100
        s1.addFirst(100);
        s1.addLast(1000);

        s1.forEach(n -> show(n));
    }

    static void show(int n) {
        System.out.println(n);
    }
}