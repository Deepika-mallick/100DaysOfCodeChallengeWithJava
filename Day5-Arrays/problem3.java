package arrays.array1D;

import java.util.Scanner;

public class problem3 {
    //Take an array of numbers as input and check if it is an array sorted in ascending order.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of array elements: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i] > numbers[i+1])//condition for descending
                isAscending = false;
        }
        if(isAscending){
            System.out.println("The Array is sorted");
        }else{
            System.out.println("The Array is not sorted");
        }

    }
}
