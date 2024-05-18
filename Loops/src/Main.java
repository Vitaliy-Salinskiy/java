public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 55; i++){
            if(i == 50){
                break;
            }
            if(i >= 30 && i <= 40){
                continue;
            }
            System.out.println("For: i = " + i);
        }

        int number = 0;
        while (number <= 50){
            number++;
            System.out.println("While: number = " + number);
        }

        int doNumber = 0;

        do{
            System.out.println("Do while: doNumber = " + doNumber);
            doNumber++;
        } while (doNumber > 1);

    }
}