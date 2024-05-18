public class Main {
    public static void main(String[] args) {

        int age = 17;

        if(age >= 18){
            System.out.println("You can vote");
            System.out.println("Please put an X in the ballot");
        }else{
            if(18 - age == 1){
                System.out.println("You can't vote;\nPlease come back in " + (18 - age) + " year.");

            }else{
                System.out.println("You can't vote;\nPlease come back in " + (18 - age) + " years.");
            }
        }

        int year = 2020;

        if(year != 2019) {
            System.out.println("This year is: " + year);
        }else if(year == 2020){
            System.out.println("This year is: " + year);
        }else{
            System.out.println("All conditions failed");
        }

        boolean isActive = false;
        int userAge = 20;

        if(!(userAge >= 10)) {
            System.out.println("The user is active");
        }else {
            System.out.println("The user is not active");
        }

    }
}