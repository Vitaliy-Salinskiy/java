public class Challenge {
    public static void main(String[] args) {

        int[] array = {12, 23, 54, 65, 543};

        int fnResult = getMax(array);

        System.out.println("Max number is: " + fnResult);

    }

    public  static int getMax(int[] numbers){
        int max = numbers[0];

        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }

        return max;
    }
}
