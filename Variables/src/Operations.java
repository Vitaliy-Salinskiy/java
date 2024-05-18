public class Operations {
    public static void main(String[] args){

        int num1 = 5;
        int num2 = 3;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        System.out.println("Mixed: " + ((num1 + num2) * 4) / 2);

        int myNumber = 2;
        System.out.println("myNumber: " + myNumber);

        myNumber *= 5;
        System.out.println("myNumber: " + myNumber);

        myNumber += 2;
        System.out.println("myNumber: " + myNumber);

        myNumber /= 3;
        System.out.println("myNumber: " + myNumber);

        myNumber %= 3;
        System.out.println("myNumber: " + myNumber);

        myNumber += 2;
        System.out.println("myNumber: " + myNumber);

        myNumber = 0;
        System.out.println("Postfix incrementation: " + (myNumber++));

        myNumber = 0;
        System.out.println("Prefix incrementation: " + (++myNumber));

        myNumber = 0;
        System.out.println("Postfix decrementation: " + (myNumber--));

        myNumber = 0;
        System.out.println("Prefix decrementation: " + (--myNumber));

    }
}
