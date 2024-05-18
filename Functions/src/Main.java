import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a message: ");
        String customMessage = scanner.nextLine();
        saySomething(customMessage, 20);

        int fnResult = getMax(10, 20);
        System.out.println("Max number is: " + fnResult);
    }

    public static void saySomething(String msg, int age){
        System.out.println(msg + ". " + "Your age is: " + age);
    }

    public  static int getMax(int num1, int num2){
        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }
}