import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to insert");
        int elm = sc.nextInt();

        System.out.println("Enter Posn from (0 to " + n + ") to insert");
        int pos = sc.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid input");
        } else {

            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }


            arr[pos] = elm;

            System.out.println("Array after insertion");
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}

