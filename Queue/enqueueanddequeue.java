import java.util.*;

class Queue {
    class Node {

        Node next;
        int data;
    }

    Node rear = null;
    Node front = null;

    Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if (rear == null && front == null) {
            rear = front = newnode;
            rear.next = front.next = null;

        } else {
            rear.next = newnode;
            rear = newnode;

        }
    }

    void display() {
        if (rear == null && front == null) {
            System.out.println("The queue is empty");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void dequeue() {
        if (rear == null && front == null) {
            System.out.println("The queue is empty");
        } else {
            Node temp = front;
            front = front.next;
        }
    }

    void peek() {
        if (rear == null && front == null) {
            System.out.println("The queue is empty");
        } else {
            System.out.println(front.data);
        }
    }

    void Isempty() {
        if (rear == null && front == null) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }
    }
}

class enqueueanddequeue {
    public static void main(String[] args) {
        Queue s1 = new Queue();
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
                    System.out.println("The first data of queue has been deleted");
                    s1.dequeue();
                    break;
                }
                case 4: {
                    System.out.println("The first data of queue is");
                    s1.peek();
                    break;
                }
                case 5: {
                    s1.Isempty();
                    break;
                }
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}
