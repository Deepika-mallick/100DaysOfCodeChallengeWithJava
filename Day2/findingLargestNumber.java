import java.util.Scanner;

public class findingLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

//        int max = num1;
//        if(max < num2){
//            max = num2;
//        }if(max < num3){
//            max = num3;
//        }
        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println(max);
    }
}
