import java.util.Arrays;
import java.util.Scanner;

public class Cupcake 
{
        public static void main(String[] args) 
        {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();

                Arrays.sort(arr);
                long miles = 0;
                for (int i = 0; i < n; i++)
                        miles += arr[n - 1 - i] * (1L << i);

                System.out.println(miles);
    }   
}
