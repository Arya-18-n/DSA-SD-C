import java.util.Scanner;

public class Access {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int[] arr = new int[n];

        System.out.println("Enter Array Elements");

         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }

        System.out.println("Array is :" );
         for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }
    }
}
