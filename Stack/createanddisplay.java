import java.util.*;

class Stack {
    class Node {
        Node next;
        Node top = null;
        Node top2 = null;
        int data;
    }

    Node push(Node top, int data) {
        Node newnode = new Node();
        newnode.data = data;
        if (top == null) {
            top = newnode;
            newnode.next = null;
            return top;
        } else {
            newnode.next = top;
            top = newnode;
            return top;
        }
    }

    Node display(Node top) {
        if (top == null) {
            System.out.println("Underflow");
            return top;
        } else {
            while (top != null) {
                System.out.println(top.data);
                top = top.next;
            }
            return top;
        }
    }
}

public class createanddisplay {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack.Node s2 = s1.new Node();
        Scanner myobj = new Scanner(System.in);
        int ch = 1, choice, data, top = -1;
        System.out.println("1.Push\n2.Display");
        while (ch == 1) {
            System.out.println("Enter your choice");
            choice = myobj.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Push the element in the stack");
                    data = myobj.nextInt();
                    s2.top = s1.push(s2.top, data);
                    break;
                }
                case 2: {
                    System.out.println("The element inside the stack are : ");
                    s1.display(s2.top);
                    break;
                }
                default: {
                    System.out.println("Wrong choice");
                }
            }

        }
    }
}