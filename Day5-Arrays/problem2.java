package arrays.array1D;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class problem2 {
    //Find the maximum & minimum number in an array of integers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the numbers");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
            System.out.println("The largest number is : "+ max);
            System.out.println("The smallest number is : "+ min);
    }
}
