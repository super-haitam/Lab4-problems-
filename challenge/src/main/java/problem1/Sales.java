package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the number of salespeople: \n");
        final int SALESPEOPLE = scan.nextInt();

        int[] sales = new int[SALESPEOPLE];
        int sum;
        int max_idx, min_idx;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        max_idx = 0;
        min_idx = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > sales[max_idx]) max_idx = i;
            if (sales[i] < sales[min_idx]) min_idx = i;
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + sum/sales.length);
        System.out.printf("Salesperson %d had the highest sale with $%d\n", max_idx+1, sales[max_idx]);
        System.out.printf("Salesperson %d had the lowest sale with $%d\n", min_idx+1, sales[min_idx]);

        System.out.println("\nEnter a value: ");
        int threshold = scan.nextInt();
        int count = 0;
        for (int i= 0; i < sales.length; ++i) {
            if (sales[i] > threshold) {
                System.out.printf("Salesperson %d exceeded that amount with $%d.\n", i+1, sales[i]);
                count ++;
            }
        }
        System.out.printf("There are %d salespeople who have exceeded that amount.\n", count);

    }
}