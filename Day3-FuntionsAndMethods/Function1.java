package FuntionsAndMethods;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        System.out.println("The sum of the numbers are: "+ Function1.sum());
    }

    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numeric value1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Numeric value2: ");
        int num2 = sc.nextInt();

        return num1 + num2;
    }
}
