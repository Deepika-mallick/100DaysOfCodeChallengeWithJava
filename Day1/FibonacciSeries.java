import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a);
        for (int i = 0; i < limit; i++) {
            int result = a + b;
            b = a;
            a = result;
            System.out.print( " " + result);
        }
    }
}
