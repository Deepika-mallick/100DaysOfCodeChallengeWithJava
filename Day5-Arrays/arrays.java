import java.util.Scanner;

public class arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //for input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number: ");
            numbers[i] = sc.nextInt();
        }

        //for output
        System.out.print("The elements of the array are: ");
        //print the numbers in array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}