import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <= rows - 3; i++)
        {
            for(int j = 0; j <= cols - 3; j++)
            {
                int sum = matrix[i][j]
                        + matrix[i][j + 1]
                        + matrix[i][j + 2]
                        + matrix[i + 1][j + 1]
                        + matrix[i + 2][j]
                        + matrix[i + 2][j + 1]
                        + matrix[i + 2][j + 2];

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Maximum Hourglass Sum = " + maxSum);
    }
}
