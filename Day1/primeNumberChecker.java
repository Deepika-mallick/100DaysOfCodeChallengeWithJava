import java.util.Scanner;

public class primeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isPrime(input));

    }

    public static boolean isPrime(int input){
        if(input <= 1){
            System.out.println(input + " Is not a prime");
            return false;
        }
        int c = 2;
        while(c*c <= input){
            if(input % 2 == 0){
                System.out.println(input + " Is a prime");
                return true;
            }
            c++;
        }
        System.out.println(input + " Is a prime");
        return c * c > input;
    }
}
