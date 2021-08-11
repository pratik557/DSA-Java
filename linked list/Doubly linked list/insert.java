import java.util.*;

class Doublylinkedlist {
    class Node {
        Node prev;
        int data;
        Node next;
        Node start = null;
    }

    Node temp;

    Node create(Node start, int data) {
        Node newnode = new Node();
        newnode.data = data;
        if (start == null) {
            start = temp = newnode;
            start.prev = null;
            start.next = null;
        } else {
            temp.next = newnode;
            newnode.prev = temp;
            temp = newnode;
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
}

public class insert {
    public static void main(String args[]) {
        Doublylinkedlist s1 = new Doublylinkedlist();
        Doublylinkedlist.Node s2 = s1.new Node();
        Scanner sc = new Scanner(System.in);
        // switch case
        int ch = 1, data, choice;
        while (ch == 1) {
            System.out.println("1.create\n2.Display\n3.Exit\n");
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
                    ch = 0;
                }
                default: {
                    System.out.println("Wrong choice\n");
                }
            }
        }

    }
}
