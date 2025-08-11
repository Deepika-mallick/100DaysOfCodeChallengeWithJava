import java.util.Scanner;

public class SummationOfFirst20Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        double N = sc.nextDouble();
        
        int result = summation(N);
        if(result == -1){
            System.out.println("Invalid range");
        } else {
            System.out.println(result);
        }
        sc.close();
    }

    public static int summation(double N){
        if (N <= 0) return -1;
        if (N != (int) N) return -1; // fractional check

        int intN = (int) N;
        int result = 0;
        for (int i = 1; i <= intN; i++){
            result += i;
        }
        return result;
    }
}

