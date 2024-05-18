public class Main {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Model S", "Red", 2);
        Car bmw = new Car("BMW", "M3", "Black", 4);
        Car unknown = new Car("Ford");

        String unknownCarDetails = unknown.toString();
        System.out.println(unknownCarDetails);

        tesla.move();

        tesla.setModel("Model 3");
        String carModel = tesla.getModel();

        String carDetails = tesla.toString();

        System.out.println(carDetails);
        System.out.println("The model of the car is: " + carModel);

        bmw.stop();
    }
}