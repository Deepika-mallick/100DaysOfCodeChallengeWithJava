import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.Scanner;

public class MaximumAndMinimumDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired number: ");
        int num = sc.nextInt();
        System.out.println("The result of the above numbers are below: ");
        digitComparison(num);
    }
    public static void digitComparison(int num){
        num = Math.abs(num);
        if(num == 0){
            System.out.println("0");
            return ;
        } else {
            int minDigit = 9;
            int maxDigit = 0;
            while (num > 0) {
                int digit = num % 10;
                if (digit < minDigit) {
                    minDigit = digit;
                }
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                num /= 10;
            }
            System.out.println("Maximum digit: " + maxDigit);
            System.out.println("Minimum digit: " + minDigit);
        }
    }
}
