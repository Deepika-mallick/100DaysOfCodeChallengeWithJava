package arrays.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rowSize = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columnSize = sc.nextInt();
        sc.nextLine();

        //Declaration and creation of multidimensional array
        int[][] array = new int[rowSize][columnSize];

        //input for array
        for(int row = 0; row < array.length; row++){
            //for each column in every row
            for(int cols = 0; cols < array[row].length; cols++){
                System.out.print("Enter the element for [" + row + "] and [" + cols + "]: ");
                array[row][cols] = sc.nextInt();
            }
            System.out.println();
        }

        //output of array
        for (int[] rows : array) {
//            for (int val: rows) {
//                System.out.print(val + " ");
            System.out.println(Arrays.toString(rows));
            }
            System.out.println();
        }
    }

