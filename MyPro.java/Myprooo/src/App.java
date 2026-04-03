import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers ?");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            System.out.println("Enter a number " + i + ": ");
            int num = input.nextInt();
            sum = sum + num;
        }
        double average = (double) sum/n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        input.close();

    }
}
