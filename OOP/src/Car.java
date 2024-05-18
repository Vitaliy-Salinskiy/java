public class Car extends Vehicle {

    private String model;
    private int doors;

    public Car(String name, String model, String color, int doors) {
        super(name, color);
        this.model = model;
        this.doors = doors;
    }

    public static void displayData(){
        System.out.println("This is a car");
    }

    @Override
    public String toString(){
        return "Car{" +
                "name='" + getName() + '\'' +
                ", model='" + model + '\'' +
                ", color='" + getColor() + '\'' +
                ", doors=" + doors +
                '}';
    }

}
