public class Main {
    public static void main(String[] args) {
        Plane boing = new Plane("Boing 747", "Boing", "White", 4, 4);
        Car tesla = new Car("Tesla", "Model S", "Red", 4);

        Car.displayData();

        String teslaDetails = tesla.toString();
        System.out.println(teslaDetails);
        tesla.move();

        String boingDetails = boing.toString();
        System.out.println(boingDetails);
        boing.move();

    }
}