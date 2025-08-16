package arrays.array2D;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {1, 5, 7}
        };

        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
