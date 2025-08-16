import java.util.Scanner;

public class spiralTransverseProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the matrix");
        int rows = sc.nextInt();
        System.out.println("Enter the column size of the matrix");
        int column = sc.nextInt();
        int matrix[][] = new int[rows][column];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int columnStart = 0;
        int columnEnd = column - 1;

        while(rowStart <= rowEnd && columnStart <= columnEnd){
            for(int i = columnStart; i <= columnEnd; i++){
                System.out.print(matrix[rowStart][i]+" ");
            }
            rowStart++;

            for(int i = rowStart; i <= rowEnd; i++){
                System.out.print(matrix[i][columnEnd]+" ");
            }
            columnEnd--;

            for(int i = columnEnd; i >= columnStart; i--) {
                System.out.print(matrix[rowEnd][i]+" ");
            }
            rowEnd--;

            for(int i = rowEnd; i >= rowStart; i--){
                System.out.print(matrix[i][columnStart]+" ");
            }
            columnStart++;
        }
    }
}
