import java.util.Scanner;

public class CountingFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int count = 0;

        if(temp == 0){
            count = 1;
        }else{
            while(temp > 0){
                temp /= 10;
                count++;
            }
        }
        System.out.println("The total digits in the input number is: " + count);
    }
}
