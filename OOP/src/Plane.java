public class Plane extends Vehicle {

    private String model;
    private int doors;
    private int engines;

    public Plane(String name, String model, String color, int doors, int engines) {
        super(name, color);
        this.model = model;
        this.doors = doors;
        this.engines = engines;
    }

    @Override
    public void move(){
        System.out.println("Moving by flying");
        super.move();
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                "model='" + model + '\'' +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                ", engines=" + engines +
                '}';
    }

}
