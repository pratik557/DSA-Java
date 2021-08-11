import java.util.*;

class doublelinkedlist {
    class Node {
        Node prev;
        int data;
        Node next;
        Node start = null;
        Node last = null;
    }

    Node temp;
    Node last;

    Node create(Node start, int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.prev = null;
        newnode.next = null;
        if (start == null) {
            start = newnode;
            last = newnode;
        } else {
            last.next = newnode;
            newnode.prev = last;
            last = newnode;
        }
        return start;
    }

    void Display(Node start) {
        Node ptr = start;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    Node insertatbeg(Node start, int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.prev = null;
        newnode.next = start;
        start = newnode;
        return start;
    }

    Node insertatend(Node start, int data) {
        Node newnode = new Node();
        newnode.data = data;
        last.next = newnode;
        newnode.prev = last;
        last = newnode;
        last.next = null;
        return start;
    }
}

public class DoubleLinkedListAll {
    public static void main(String args[]) {
        doublelinkedlist s1 = new doublelinkedlist();
        doublelinkedlist.Node s2 = s1.new Node();
        Scanner sc = new Scanner(System.in);
        int ch = 1, data, choice;
        while (ch == 1) {
            System.out.println("1.create\n2.Display\n3.Insert at beginning\n4.Insert at end\n5.exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter any data");
                    data = sc.nextInt();
                    s2.start = s1.create(s2.start, data);
                    break;
                }
                case 2: {
                    System.out.println("Display the inserted data");
                    s1.Display(s2.start);
                    break;
                }
                case 3: {
                    System.out.println("Enter the data for newnode at beginning");
                    data = sc.nextInt();
                    s2.start = s1.insertatbeg(s2.start, data);
                    break;
                }
                case 4: {
                    System.out.println("Enter the data for newnode at end");
                    data = sc.nextInt();
                    s2.start = s1.insertatend(s2.start, data);
                    break;
                }
                case 5: {
                    ch = 0;
                }
                default: {
                    System.out.println("Wrong choice\n");
                }
            }
        }
    }
}
