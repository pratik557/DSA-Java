import java.util.*;

class Stack {
    class Node {
        Node top = null;
        Node next;
        String data;
    }

    Node push(Node top, String data) {
        Node newnode = new Node();
        newnode.data = data;
        if (top == null) {
            top = newnode;
            top.next = null;
            return top;
        } else {
            newnode.next = top;
            top = newnode;
            return top;
        }
    }

    Node display(Node top) {
        if (top == null) {
            return top;
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            return top;
        }
    }
}

public class reversestring {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack.Node s2 = s1.new Node();
        int ch = 1, choice, top = -1;
        String data1;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Push\n2.Display");
        while (ch == 1) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Push the element inside stack");
                    data1 = sc.next();
                    s2.top = s1.push(s2.top, data1);
                    break;
                }
                case 2: {
                    System.out.println("The element inside the stack are");
                    s1.display(s2.top);
                    break;
                }
                default: {
                    System.out.println("Wrong Choice");
                    break;
                }

            }

        }
    }
}