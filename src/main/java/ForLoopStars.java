import java.util.Scanner;

public class ForLoopStars {

    // Complete the staircase function below.
    private static void staircase(int n) {for(int i = 1; i<=n; i++)
    {
        for(int k=n;k>i;k--)
        {
            System.out.printf(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.printf("#");
        }
        System.out.println();
    }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}