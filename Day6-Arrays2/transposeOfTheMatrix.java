import java.util.Scanner;

public class transposeOfTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row");
        int rows = sc.nextInt();
        System.out.println("Enter the length of column");
        int columns = sc.nextInt();
        
        int [][] matrix = new int[rows][columns];

        System.out.println("Enter the characters of the matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix [i][j] = sc.nextInt();
            }
        }

        System.out.println("The Transpose of the matrix is: ");
        for(int j = 0; j < columns; j++){
            for(int i = 0; i < rows; i++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}

