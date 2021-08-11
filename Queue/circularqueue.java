import java.util.*;

class Queue {
    class Node {
        int data;
        Node next;
    }

    Node front = null;
    Node rear = null;

    Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int data) {
        Node newnode = new Node();
        newnode.data = data;
        if (front == null && rear == null) {
            newnode.next = front;
            front = rear = newnode;
        } else {
            rear.next = newnode;
            newnode.next = front;
            rear = newnode;
        }
    }

    void display() {
        if (front == null && rear == null) {
            System.out.println("Empty");
        } else {
            Node temp = front;
            System.out.println(temp.data);
            temp = temp.next;
            while (temp != front) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }
    }

    void dequeue() {
        Node temp = front;
        if (front == rear) {
            front = null;
            rear = null;
        }
        front = temp.next;
        rear.next = temp.next;
    }

    void peek() {
        if (front == null && rear == null) {
            System.out.println("Empty");
        } else {
            System.out.println(front.data);
        }
    }
}

public class circularqueue {
    public static void main(String[] args) {
        Queue s1 = new Queue();
        // Queue.Node s2 = s1.new Node();
        Scanner sc = new Scanner(System.in);
        int ch = 1, choice, data;
        System.out.println("1.Enqueue\n2.Display\n3.Dequeue\n4.peek\n5.IsEmpty");
        while (ch == 1) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter any data");
                    data = sc.nextInt();
                    s1.enqueue(data);
                    break;
                }
                case 2: {
                    System.out.println("The data inside Queue are");
                    s1.display();
                    break;
                }
                case 3: {
                    System.out.println("The front element is dequeued ");
                    s1.dequeue();
                    break;
                }
                case 4: {
                    System.out.println("The front element in Queued is ");
                    s1.peek();
                    break;
                }
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}
