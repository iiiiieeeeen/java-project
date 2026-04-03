import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    static Scanner input = new Scanner(System.in);
    System.out.println("Hoe many Numbers?");
    int n = input.nextInt();
    for (int i = 1; i <= n; i++){
        System.out.println("Enter Number" + i + ": ");
        int num = input.nextInt();
        int sum = 0;
        sum = sum + num;
     }
    double average = sum/n;
        System.out.println("SUM = " + sum);
        System.out.println("AVERAGE = " + average);
}

}
