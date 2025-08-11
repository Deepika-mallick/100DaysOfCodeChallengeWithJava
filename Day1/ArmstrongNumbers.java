import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println(isArmstrongNumber(input));
        for (int i = 1; i < 1000; i++) {
            if(isArmstrongNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrongNumber(int input){
        int original = input;
        int sum = 0;
        while(input > 0){
            int rem = input % 10;
            input = input / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
