public class LogicalOperators {
    public  static  void main(String[] args){

        boolean isActive = false;
        int score = 100;

        if(score <= 100 && isActive){
            System.out.println("You opened the next level");
        } else {
            System.out.println("You're at the same level");
        }

        int num1 = 5;
        int num2 = 3;

        if(num1 > 0 || num2 > 0){
            System.out.println("At least one number is positive");
        } else {
            System.out.println("Both numbers are negative");
        }

    }
}
