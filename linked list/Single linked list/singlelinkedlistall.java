import java.util.*;

class singlelinkedlist {
    class Node {
        int data;
        Node next;// here Node is datatype.
        Node start1 = null;
        Node start2 = null;
        public singlelinkedlist.Node start;
    }

    Node create(Node start, int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if (start == null) {
            start = newnode;
            return start;
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            return start;
        }
    }

    Node insertatbeg(Node start, int data) {
        Node newnode = new Node();
        newnode.data = data;// initilizing data for newnode
        newnode.next = start;// In this logic start will be now placed ta newnode->next.
        start = newnode;// then start will be empty and we store value of newnode in start.
        return start;
    }

    Node insertatend(Node start, int data) {
        Node newnode = new Node();
        newnode.data = data;
        Node ptr = start;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newnode;
        ptr = newnode;
        newnode.next = null;
        return start;

    }

    Node insertatanypoint(Node start, int data, int pos) {
        Node newnode = new Node();
        newnode.data = data;
        Node ptr = start;
        int count = 1;
        while (ptr != null && count < pos - 1) {
            count = count + 1;
            ptr = ptr.next;
        }
        newnode.next = ptr.next;
        ptr.next = newnode;
        return start;
    }

    void search(Node start, int x) {
        Node temp = start;
        while (temp != null) {
            if (temp.data == x) {
                System.out.println("The node is present");
                break;
            } else {
                System.out.println("The node not found");
            }
            temp = temp.next;// it will check upto the null point.
        }
    }

    // Delete the node without using head point.
    void deletebeg(Node start) {// input 1-2-3-4-5
        Node temp = start.next;// temp is empty start.next(adress of 2) is storing in temp.next (address of
                               // temp i.e temp=address of 2)
        start.data = temp.data;// start data is overridden in temp then, 1 will be removed and 2-2-3-4-5
        start.next = temp.next;// both pointing to 1st node i.e 2
        temp = null;

    }

    int counttotalnode(Node start) {
        int count = 0;
        if (start == null) {
            return 0;
        } else {
            Node temp = start;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;

    }

    void display(Node start) {
        if (start == null) {
            System.out.println("no data");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

public class singlelinkedlistall {
    public static void main(String args[]) {
        singlelinkedlist sl = new singlelinkedlist();
        singlelinkedlist.Node s2 = sl.new Node();
        Scanner myobj = new Scanner(System.in);
        // switch case.
        int ch = 1, data, pos, choice;
        int totalnode = 0;
        while (ch == 1) {
            System.out.println(
                    "1.Create\n2.Insert at beg\n3.Insert at end\n4.Insert at any point\n5.search\n6.Delete at beginning\n7.The total number of node\n8.Display\n9.Exit\nEnter your choice");
            choice = myobj.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter any data");
                    data = myobj.nextInt();
                    s2.start = sl.create(s2.start, data);
                    break;
                }
                case 2: {
                    System.out.println("Enter the new data for new node");
                    data = myobj.nextInt();
                    s2.start = sl.insertatbeg(s2.start, data);
                    break;
                }

                case 3: {
                    System.out.println("Enter the new data for new node");
                    data = myobj.nextInt();
                    s2.start = sl.insertatend(s2.start, data);
                    break;
                }
                case 4: {
                    System.out.println("Enter the new data for the new node");
                    data = myobj.nextInt();
                    System.out.println("Enter the Position you want to insert");
                    pos = myobj.nextInt();
                    s2.start = sl.insertatanypoint(s2.start, data, pos);
                    break;
                }
                case 5: {
                    System.out.println("Enter the data you want to search");
                    data = myobj.nextInt();
                    sl.search(s2.start, data);
                    break;
                }
                case 6: {
                    System.out.println("The 1st node is deleted");
                    sl.deletebeg(s2.start);
                    break;
                }
                case 7: {
                    totalnode = sl.counttotalnode(s2.start);
                    System.out.println("The total number of node in the linked list is " + totalnode);
                    break;
                }
                case 8: {
                    System.out.println("your entered data are");
                    sl.display(s2.start);
                    break;
                }
                case 9: {
                    ch = 0;
                }
                default: {
                    System.out.println("Wrong choice\n");
                }
            }
        }
    }
}