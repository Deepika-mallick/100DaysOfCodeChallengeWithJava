package loops;

import java.util.Scanner;

public class simpleForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input of number:");
        int num = sc.nextInt();
        //use for loop when we know exactly how many times the loop will execute
        for(int i = 1; i <= num; i++){
                System.out.print(i + " ");
            }
        }
    }

