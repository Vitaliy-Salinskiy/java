public class Main {
    public static void main(String[] args) {

        int[] numbers = {12,15,60,100,200,20,50};
        System.out.println("First element: " + numbers[0]);
        System.out.println("Length: " + numbers.length);

        for (int number : numbers){
            System.out.println("For each loop result: " + number);
        }

        for(int i = 0; i <= numbers.length - 1; i++){
            System.out.println("For loop result: " + numbers[i]);
        }

        String[] friends = {"John", "Michael", "David", "Peter", "Sam", "Tom", "Jerry", "Bob", "Alice", "Eva"};
        for (String friend : friends){
            System.out.println("Friends. For each loop result: " + friend);
        }

        int[] numbers2 = new int[5];
        numbers2[0] = 10;
        numbers2[1] = 57;
        numbers2[2] = 31;
        numbers2[3] = 74;
        numbers2[4] = 22;

        for (int number : numbers2){
            System.out.println("For each loop result: " + number);
        }

    }
}