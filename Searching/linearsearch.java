import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n, i, val;
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the element in an array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        val = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == val) {
                System.out.println(val + " is Present");
                break;
            } else {
                System.out.println(val + " is Not Present");
            }

        }
    }

}