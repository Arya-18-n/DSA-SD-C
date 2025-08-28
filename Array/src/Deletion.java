import java.util.Scanner;

public class Deletion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements in Array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter posn (0 to " + (n - 1) + ") to Delete");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= n) {
            System.out.println("Invalid Input");
        } else {

            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[pos]= Integer.parseInt(null);

            System.out.println("Array After Deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
