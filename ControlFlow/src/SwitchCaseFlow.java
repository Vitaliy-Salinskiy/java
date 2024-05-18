import java.util.Scanner;

public class SwitchCaseFlow {

    public  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the time: ");
        int time = scanner.nextInt();

//        Normal switch case
        switch (time){
            case 10:
                System.out.println("The time is: " + time + "\nTime for coffee.");
                break;
            case 12:
                System.out.println("The time is: " + time + "\nTime for run.");
                break;
            case 7:
                System.out.println("The time is: " + time + "\nTime for wake up.");
                break;
            default:
                System.out.println("The time is: " + time + "\nTime to relax.");
                break;
        }

//        Enhanced switch case
        switch (time){
            case 10 -> {
                    System.out.println("From Enhanced. The time is: " + time + "\nTime for coffee.");
                    // more code
            }
            case 12 -> System.out.println("From Enhanced. The time is: " + time + "\nTime for run.");
            case 7 -> System.out.println("From Enhanced. The time is: " + time + "\nTime for wake up.");
            default -> System.out.println("From Enhanced. The time is: " + time + "\nTime to relax.");
        }

    }
}
