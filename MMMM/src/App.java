import java.util.Scanner;
public class App {
    static double add (double a , double b) {
        return a + b;
    }
    static double sub (double a , double b) {
        return a - b;
    }
    static double mult (double a , double b){
        return a*b;
    }
    static double div (double a , double b){
        return a/b;
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Choice an operation  (+ , - , / , *) :  ");
        String choice = input.nextLine();
        if (choice ==" 0"){
            break;
        }
        System.out.println("Enter first number : ");
        double a = input.nextDouble();
        System.out.println("Enter secound number : ");
        double b = input.nextDouble();
        double result = 0;
        if(choice == ("+")){
            result = add(a , b);
        }
        else if(choice == ("-")){
            result = sub(a , b);
        }
        else if(choice ==("*")){
            result = mult(a , b);
        }
        else if(choice == ("/")){
            result = div(a , b);
        }
        else{
            System.out.println("Invalid choice");
            continue;
        }
        }
        input.close();
    }
}
