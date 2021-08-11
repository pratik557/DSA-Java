import java.util.*;

class Stack {
    class Node {
        Node next;
        Node top = null;
        Node top2 = null;
        int data;
    }

    Node pushA(Node top, int data) {
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

    Node displayA(Node top) {
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

    Node popA(Node top) {
        if (top == null) {
            return top;
        } else {
            top.next = top;
            return top;
        }
    }

    // Inserting in 2nd stack
    Node pushB(Node top2, int data) {
        Node newnode = new Node();
        newnode.data = data;
        if (top2 == null) {
            top2 = newnode;
            newnode.next = null;
            return top2;
        } else {
            newnode.next = top2;
            top2 = newnode;
            return top2;
        }
    }

    Node displayB(Node top2) {
        if (top2 == null) {
            System.out.println("Underflow");
            return top2;
        } else {
            while (top2 != null) {
                System.out.println(top2.data);
                top2 = top2.next;
            }
            return top2;
        }
    }

    Node popB(Node top2) {
        if (top2 == null) {
            return top2;
        } else {
            top2.next = top2;
            return top2;
        }
    }

}

public class multiple_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack.Node s2 = s1.new Node();
        Scanner myobj = new Scanner(System.in);
        int ch = 1, choice, data, top = -1;
        System.out.println(
                "1.Push in stack A\n2.Display Stack A\n3.Pop Stack A\n4.Push in stack B\n5.Display Stack B\n6.Pop Stack B");
        while (ch == 1) {
            System.out.println("Enter your choice");
            choice = myobj.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Push the element in the stack A");
                    data = myobj.nextInt();
                    s2.top = s1.pushA(s2.top, data);
                    break;
                }
                case 2: {
                    System.out.println("The element inside the stack A are");
                    s1.displayA(s2.top);
                    break;
                }
                case 3: {
                    System.out.println("The top of Stack A element has been deleted");
                    s2.top = s1.popA(s2.top);
                    break;
                }
                case 4: {
                    System.out.println("Push the element in the stack B");
                    data = myobj.nextInt();
                    s2.top2 = s1.pushB(s2.top2, data);
                    break;
                }
                case 5: {
                    System.out.println("The element inside the stack B are ");
                    s1.displayB(s2.top2);
                    break;
                }
                case 6: {
                    System.out.println("The top of Stack B element has been deleted ");
                    s2.top2 = s1.popB(s2.top2);
                    break;
                }
                default: {
                    System.out.println("Wrong choice");
                }
            }

        }
    }
}