package arrays.array1D;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number you wanna find: ");
        int x = sc.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i]==x){
                System.out.println("The position of "+numbers[i]+" is at "+i);
            }
        }
    }
}
