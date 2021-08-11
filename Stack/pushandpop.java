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

    Node pop(Node top) {
        if (top == null) {
            return top;
        } else {
            top = top.next;
            return top;
        }
    }

    int peek(Node top) {// peek/topelement
        if (top == null)
            return -1;
        else {
            return top.data;
        }
    }

    Node copy(Node top, Node top2) {
        int copyval = 0;
        while (top != null) {
            copyval = peek(top);
            top = pop(top);
            top2 = push(top2, copyval);
        }
        return top2;
    }

}

public class pushandpop {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack.Node s2 = s1.new Node();
        Scanner sc = new Scanner(System.in);
        int ch = 1, choice, data1, val, top = -1;
        System.out.println("1.push\n2.Display\n3.pop\n4.peek\n5.copy");
        while (ch == 1) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("push the element in stack");
                    data1 = sc.nextInt();
                    s2.top = s1.push(s2.top, data1);
                    break;
                }

                case 2: {
                    System.out.println("The element inside the stack");
                    s1.display(s2.top);
                    break;
                }
                case 3: {
                    System.out.println("The element is deleted");
                    s2.top = s1.pop(s2.top);
                    break;
                }
                case 4: {
                    val = s1.peek(s2.top);
                    if (val != -1) {
                        System.out.println("The value at the top of stack is " + val);
                    } else {
                        System.out.println("The stack is empty");
                    }
                    break;
                }

                case 5: {
                    System.out.println("The vaule of 2nd stack ");
                    s2.top2 = s1.copy(s2.top, s2.top2);
                    s1.display(s2.top2);
                    break;
                }

                default: {
                    System.out.println("Wrong choice");
                }
            }

        }

    }
}