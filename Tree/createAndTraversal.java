import java.util.*;

class Tree {
    class Node {
        int data;
        Node left;
        Node right;
        Node root = null;
    }

    Node insertion(Node root, int data) {
        Node newnode = new Node();
        newnode.data = data;
        Node parent = root;
        Node temp = root;
        if (root == null) {
            root = newnode;
            root.left = null;
            root.right = null;
            return root;
        } else {
            temp = root;
            while (temp != null) {
                parent = temp;
                if (data < temp.data) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
            if (data < parent.data) {
                parent.left = newnode;
            } else {
                parent.right = newnode;
            }
        }
        return root;

    }

    void Inorder(Node root) {
        if (root != null) {
            Inorder(root.left);
            System.out.println(root.data);
            Inorder(root.right);
        }
    }

    void Preorder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            Inorder(root.left);
            Inorder(root.right);
        }
    }

    void Postorder(Node root) {
        if (root != null) {
            Inorder(root.left);
            Inorder(root.right);
            System.out.println(root.data);
        }
    }

    int TotalNode(Node root) {
        Node temp = root;
        if (temp == null) {
            return 0;
        } else {
            return (TotalNode(temp.left) + TotalNode(temp.right) + 1);
        }
    }

    void kthlevelvalue(Node root, int n) {
        if (n == 0) {
            System.out.println(root.data);
        } else if (root != null) {
            kthlevelvalue(root.left, n - 1);
            kthlevelvalue(root.right, n - 1);
        }
    }

    int DepthOfTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftdepth, rightdepth;
            leftdepth = DepthOfTree(root.left);
            rightdepth = DepthOfTree(root.right);
            if (leftdepth > rightdepth) {
                return leftdepth + 1;
            } else
                return rightdepth + 1;
        }
    }

    Boolean IsBSt(Node root) {
        if (root == null) {
            return false;
        }
        if (root.left != null && root.left.data > root.data) {
            return false;
        }
        if (root.right != null && root.right.data < root.data) {
            return false;
        } else {
            return true;
        }
    }

    Node search(Node root, int key) {// not working
        if (root == null) {
            return null;
        }
        if (key == root.data) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    int leafnode(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            Node temp = root;
            return (leafnode(temp.left) + leafnode(temp.right));
        }
    }

    Node mirrorImage(Node root) {
        if (root != null) {
            mirrorImage(root.left);
            mirrorImage(root.right);
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;
    }

}

public class createAndTraversal {
    public static void main(String[] args) {
        Tree s1 = new Tree();
        Tree.Node s2 = s1.new Node();
        Scanner sc = new Scanner(System.in);
        int ch = 1, choice, data, n;
        while (ch == 1) {
            System.out.println(
                    "1.Insertion\n2.Inorder Traversal\n3.Pre-order Traversal\n4.Post-order Traversal\n5.Total number of NOde.\n6.Print the value of n level\n7.Depth of the tree\n8.IsBST or Not\n9.search\n10.Count leaf node\n11.print the mirror image");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter any data");
                    data = sc.nextInt();
                    s2.root = s1.insertion(s2.root, data);
                    break;
                }
                case 2: {
                    System.out.println("The inorder traversal element are ");
                    s1.Inorder(s2.root);
                    break;
                }
                case 3: {
                    System.out.println("The Preorder traversal element are ");
                    s1.Preorder(s2.root);
                    break;
                }
                case 4: {
                    System.out.println("The Postorder traversal element are ");
                    s1.Postorder(s2.root);
                    break;
                }
                case 5: {
                    System.out.println("The total number of the node is " + s1.TotalNode(s2.root));
                    break;
                }
                case 6: {
                    System.out.println("Enter the value of Kth level");
                    n = sc.nextInt();
                    System.out.println("The element of Kth level are " + n);
                    s1.kthlevelvalue(s2.root, n);
                    break;
                }
                case 7: {
                    System.out.println("Depth of the tree is " + s1.DepthOfTree(s2.root));
                    break;
                }
                case 8: {
                    System.out.println("The above tree is BST Tree = " + s1.IsBSt(s2.root));
                    break;
                }
                case 9: {
                    System.out.println("enter the element you want to search ");
                    n = sc.nextInt();
                    System.out.println("Search");
                    s2.root = s1.search(s2.root, n);
                    break;
                }
                case 10: {
                    System.out.println("Total number of the leaf node is " + s1.leafnode(s2.root));
                    break;
                }
                case 11: {
                    System.out.println("The element are swapped in mirror image ");
                    s1.mirrorImage(s2.root);
                    break;
                }

                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}
