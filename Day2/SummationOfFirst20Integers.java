import java.util.Scanner;

public class SummationOfFirst20Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int N = sc.nextInt();
        int result = summation(N);
        if(result == -1){
            System.out.println("Invalid range");
        } else {
            System.out.println(result);
        }
    }
    public static int summation(int N){
        boolean isFractional = true;
        int result = 0;
        if(N < 0) return -1;
        if(isFractional) return -1;
        for(int i = 1; i <= N; i++){
            result += i;
        }
        return result;
    }
}
